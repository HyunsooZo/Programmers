import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times); 
        long left = 0;
        long right = (long)times[times.length-1] * (long)n; 
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;
            
            for (int time : times) {
                sum += mid / time;
            }
            
            if (sum >= n) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        
        return left; 
    }
}
