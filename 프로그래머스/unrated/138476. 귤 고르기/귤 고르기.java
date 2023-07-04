import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> queue = 
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        queue.addAll(map.values());
                
        while(!queue.isEmpty()){
            
            k-=queue.poll();
            answer++;
            
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}