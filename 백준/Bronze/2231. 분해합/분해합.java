import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 1) {
            System.out.println(0);
        }
        for (int i = 1; i < N; i++) {
            int sum_stri = 0;

            int temp = i;
            while (temp > 0) {
                sum_stri += temp % 10;
                temp /= 10;
            }

            if (i + sum_stri == N) {
                System.out.println(i);
                break;
            } else if (i == N - 1) {
                System.out.println(0);
                break;
            }
        }

        sc.close();
    }
}
