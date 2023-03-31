import java.util.*;
class Solution {
    public String solution(int[] food) {
        Deque<Integer> q = new LinkedList<>();
        q.offerLast(0);
        for(int i = food.length-1 ; i>0 ; i--){
            for(int j = 0 ; j < food[i]/2 ; j++){
                q.offerLast(i);
                q.offerFirst(i);
            }
        }
        String answer = "";
        while(!q.isEmpty()){
            answer += String.valueOf(q.poll());
        }
        return answer;
    }
}