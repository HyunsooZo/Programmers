import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min =Arrays.stream(arr).min().getAsInt(); 
        if(arr.length==1){
            return new int[]{-1};
        }
        return Arrays.stream(arr).filter(x->x!=min).toArray();
    }
}