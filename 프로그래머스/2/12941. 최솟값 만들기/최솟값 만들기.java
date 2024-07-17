import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // 배열 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        // 배열 역순으로 재정렬
        int[] B_reverse = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            B_reverse[i] = B[B.length - 1 - i];
        }

        // 두 배열의 곱의 합을 구함
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B_reverse[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트용 메인 함수
        Solution sol = new Solution();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(sol.solution(A, B)); 
    }
}
