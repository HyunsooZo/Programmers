import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        for(int i : arr){
            q.offer(i);
        }
        while(!q.isEmpty()){
            int pol = q.poll();
            if(q.isEmpty()){
                temp.offer(pol);
            }else if(pol!=q.peek()){
                temp.offer(pol);
            }
        }
        int[] answer = new int[temp.size()];
        int i = 0;
        while(!temp.isEmpty()){
            answer[i] = temp.poll();
            i++;
        }
        return answer;
    }
}