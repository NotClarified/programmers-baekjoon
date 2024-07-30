import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int check = in.nextInt();
        in.nextLine();  // 개행 문자 
        for (int i = 0; i < check; i++) {
            System.out.println(solve(in.nextLine()));
        }
        in.close();
    }

    public static String solve(String s) {
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                num++;
            } else if (s.charAt(i) == ')') {
                num--;
            }
            if (num < 0) {
                return "NO";
            }
        }

        if (num == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
