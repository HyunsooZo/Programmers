import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int len = queue2.length;
        long current = 0, target = 0, sum1 = 0, sum2 = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for (int i = 0; i < len; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }
        if((sum1+sum2)%2!=0){
            return -1;
        }
        target = (sum1 + sum2) / 2;

        int cnt = 0;

        for (int i = 0; i < len; i++) {
            current += queue1[i];
        }

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (current == target) {
                return cnt;
            } else if (current < target) {
                int a = q2.poll();
                current += a;
                q1.offer(a);
            } else if (current > target) {
                int b = q1.poll();
                current -= b;
                q2.offer(b);
            } else {break;}
            
            cnt++;
            if(cnt>1000000){
                break;
            }
        }

        return -1;
    }
}
