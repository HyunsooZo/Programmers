import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int cur = -1;
        int len = section.length;
        int idx = 0;
        
        while (idx < len) {
            int target = section[idx++];
            
            if (cur <= target) {
                cur = target + m; 
                answer++; 
            }
        }
        
        return answer;
    }
}
