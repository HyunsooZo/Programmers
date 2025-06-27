import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        var result = new ArrayList<Integer>();
        var previous = -1;
        for(var value : arr){
            if(value != previous){
                result.add(value);
            }
            previous = value;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}