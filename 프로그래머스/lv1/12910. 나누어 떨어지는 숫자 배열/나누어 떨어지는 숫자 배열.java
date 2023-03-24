import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        if(Arrays.stream(arr).anyMatch(x->x%divisor==0)){
        return Arrays.stream(arr).filter(x->x%divisor==0).sorted().toArray();
            } else {
            return new int[]{-1};
        }
    }
}