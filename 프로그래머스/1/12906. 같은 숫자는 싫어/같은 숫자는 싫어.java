import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i : arr) {
            if (dq.isEmpty() || dq.peekLast() != i) {
                dq.addLast(i);
            }
        }
        
        int[] answer = new int[dq.size()];
        int idx = 0;
        while (!dq.isEmpty()) {
            answer[idx++] = dq.pollFirst();
        }

        return answer;
    }
}
