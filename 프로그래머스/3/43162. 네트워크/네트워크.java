import java.util.*;

class Solution {

    public int[] visited;
    public List<List<Integer>> list;

    public int solution(int n, int[][] computers) {
        int answer = 0;

        list = new ArrayList<>();

        visited = new int[n];

        for(int i = 0; i < computers.length; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j < computers[i].length; j++){
                if(computers[i][j] == 1 && i!=j){
                    list.get(i).add(j);
                }
            }
        }


        for(int i = 0; i < n; i++){
            if(visited[i] == 0) {
                dfs(i); 
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int next) {
        for(int value: list.get(next)) {
            if(visited[value] == 0){
                visited[value] = 1;
                dfs(value);
            }
        }
    }
}