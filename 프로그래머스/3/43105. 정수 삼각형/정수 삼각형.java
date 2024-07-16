import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int size = triangle.length;
        int [][] route = new int[size][];
        
        for(int i=0;i<size;i++) {
            route[i] = new int[i+2];
        }
        route[0][0] = triangle[0][0];
        
        for(int i =1;i<size;i++) {
            for(int j=0;j<=i; j++) {
                if(j==0) {
                    route[i][j] = route[i-1][j]+triangle[i][j];
                }
                else if(j==i) {
                    route[i][j] = route[i-1][j-1]+triangle[i][j];
                }
                else {
                    route[i][j] =Math.max(route[i-1][j-1], route[i-1][j])+ triangle[i][j];
                }
            }
        }
        Arrays.sort(route[size-1]);
        answer= route[size-1][size];
        
        return answer;
    }
}