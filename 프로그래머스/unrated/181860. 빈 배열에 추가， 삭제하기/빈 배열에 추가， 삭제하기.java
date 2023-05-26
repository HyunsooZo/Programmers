import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    q.offerLast(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    q.pollLast();
                }
            }
        }
        int[] answer = new int[q.size()];
        int l = 0;
        while (!q.isEmpty()) {
            answer[l++] = q.poll();
        }
        return answer;
    }
}
