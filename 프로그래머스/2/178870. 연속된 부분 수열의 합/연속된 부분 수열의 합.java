import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[]{0,0};
        
        int sequenceLen = sequence.length, minLen = 1000001;
        
        int start = 0 ,end = 0 ,total = 0;
        
        while(end < sequenceLen) {
            total += sequence[end];
            while(total >= k) {
                if(total == k && end-start < minLen){
                    minLen = end - start;
                    answer[0] = start;
                    answer[1] = end;
                }
                total -= sequence[start];
                start ++;
            }
            end++;
        }
        
        return answer;
    }
}