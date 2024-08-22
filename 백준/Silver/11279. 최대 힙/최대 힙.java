// import java.util.Collections;
// import java.util.PriorityQueue;
// import java.util.Scanner;
//
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         int N = scanner.nextInt();
//
//         // Collections.reverseOrder()를 사용하여 최대 힙으로 변환
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//
//         for (int i = 0; i < N; i++) {
//             int x = scanner.nextInt();
//
//             if (x > 0) {
//                 maxHeap.add(x);
//             } else if (x == 0) {
//                 if (maxHeap.isEmpty()) {
//                     System.out.println(0);
//                 } else {
//                     System.out.println(maxHeap.poll());
//                 }
//             }
//         }
//         scanner.close();
//     }
// } 
// 속도 테스트에 실패하여 버퍼로부터 입출력을 받아서 진행
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                maxHeap.add(x);
            } else {
                if (maxHeap.isEmpty()) {
                    bw.write("0\n");
                } else {
                    bw.write(maxHeap.poll() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
