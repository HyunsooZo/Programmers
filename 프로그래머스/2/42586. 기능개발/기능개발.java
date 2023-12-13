import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();

        int len = progresses.length;
        
        int seq = 0;
        
        boolean[] visited = new boolean[len];
        
        while(true){
            int cnt = 0;
            for(int i = 0 ; i < len ; i++){
                progresses[i]+= speeds[i];
            }
            
            for(int i = 0 ; i < len ; i++){
                if(i==seq && !visited[i] && progresses[i]>=100){
                    cnt++;
                    seq++;
                    visited[i] = true;
                }
            }
            
            if(cnt>0){
                list.add(cnt);
            }
            if(seq >= len){
                break;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}