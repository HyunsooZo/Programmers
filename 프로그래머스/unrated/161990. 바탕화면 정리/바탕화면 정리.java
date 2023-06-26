import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int len = wallpaper.length;
        int[] answer = new int[4];
        answer[0] = Integer.MAX_VALUE;
        answer[1] = Integer.MAX_VALUE;
        answer[2] = Integer.MIN_VALUE;
        answer[3] = Integer.MIN_VALUE;
            
        for (int i = 0; i < len; i++) {
            String s = wallpaper[i];
            int sLen = s.length();
            for (int j = 0; j < sLen; j++) {
                char c = s.charAt(j);
                if (c == '#') {
                    answer[0] = Math.min(answer[0],i);
                    answer[1] = Math.min(answer[1],j);
                }
            }
        }
        
        for (int i = len - 1; i >= 0; i--) {
            String s = wallpaper[i];
            int sLen = s.length();
            for (int j = sLen - 1; j >= 0; j--) {
                char c = s.charAt(j);
                if (c == '#') {
                    answer[2] = Math.max(i+1,answer[2]);
                    answer[3] = Math.max(j+1,answer[3]);
                }
            }
        }
        
        return answer;
    }
}
