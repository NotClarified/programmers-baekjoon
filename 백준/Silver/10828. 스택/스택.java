import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] stack = new int[N];
        int size = 0;

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
                case "push":
                    int x = Integer.parseInt(command[1]);
                    stack[size] = x;
                    size++;
                    break;
                    
                case "pop":
                    if (size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[size - 1]);
                        stack[size - 1] = 0;  // 스택에서 제거
                        size--;
                    }
                    break;
                    
                case "size":
                    System.out.println(size);
                    break;
                    
                case "empty":
                    if (size == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                    
                case "top":
                    if (size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[size - 1]);
                    }
                    break;
            }
        }
    }
}
