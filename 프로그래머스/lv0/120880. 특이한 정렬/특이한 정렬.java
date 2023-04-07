import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist).boxed().sorted((a,b)->{
            int aa = Math.abs(n-a);
            int bb = Math.abs(n-b);
            return aa==bb?b-a:aa-bb;
        }).mapToInt(i->i).toArray();
    }
}