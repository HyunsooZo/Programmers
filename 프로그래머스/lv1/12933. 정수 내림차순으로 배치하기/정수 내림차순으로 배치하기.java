import java.util.*;
class Solution {
    public long solution(long n) {
        String[] temp = String.valueOf(n).split("");
        long[] temp2 = Arrays.stream(temp).sorted(Collections.reverseOrder()).mapToLong(Long::parseLong).toArray();
        String answer = "";
        for(long i : temp2){
            answer += i;
        }
        return Long.parseLong(answer);
    }
}