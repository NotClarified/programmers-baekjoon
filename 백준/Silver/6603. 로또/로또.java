import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static List<List<Integer>> combinations = new ArrayList<>();

    // 조합 만들기
    public static void generateCombinations(int[] arr, int n, int index, int[] data, int i) {
        if (index == 6) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                combination.add(data[j]);
            }
            combinations.add(combination);
            return;
        }

        if (i >= n) {
            return;
        }

        // 지금 인덱스 포함
        data[index] = arr[i];
        generateCombinations(arr, n, index + 1, data, i + 1);

        // 그냥 생성하기
        generateCombinations(arr, n, index, data, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean firstCase = true;

        while (true) {
            int k = scanner.nextInt();
            if (k == 0) break;
            
            int[] s = new int[k];
            for (int i = 0; i < k; i++) {
                s[i] = scanner.nextInt();
            }
            
            combinations.clear();
            generateCombinations(s, k, 0, new int[6], 0);

            if (!firstCase) {
                System.out.println();
            }
            firstCase = false;

            for (List<Integer> combination : combinations) {
                for (int i = 0; i < combination.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(combination.get(i));
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
