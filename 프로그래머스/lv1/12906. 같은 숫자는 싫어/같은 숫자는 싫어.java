import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq = new LinkedList<>();
        
        for (int num : arr) {
            if (dq.isEmpty() || dq.peekLast() != num) {
                dq.addLast(num);
            }
        }
        
        int[] answer = new int[dq.size()];
        int idx = 0;
        while(!dq.isEmpty()){
            answer[idx++] = dq.poll();
        }
        
        return answer;
    }
}
