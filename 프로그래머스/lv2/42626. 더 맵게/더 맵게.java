import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i : scoville){
            q.offer(i);
        }
        while(q.size()>=2){
            int a = q.poll();
            int b = q.poll();
            if(a>=K){
                return answer;
            }
            if(q.size()==0 && a+b*2 < K){
                return -1;       
            }
            q.offer(a+b*2);
            answer++;
            
        }
        return answer;
    }
}