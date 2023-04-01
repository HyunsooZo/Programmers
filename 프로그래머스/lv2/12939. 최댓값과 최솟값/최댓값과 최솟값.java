import java.util.*;
class Solution {
    public String solution(String s) {
        String[] a = s.split(" ");
        int[] b = Arrays.stream(a).mapToInt(Integer::parseInt).toArray(); 
        String min = String.valueOf(Arrays.stream(b).min().getAsInt());
        String max = String.valueOf(Arrays.stream(b).max().getAsInt());
        
        return min+" "+ max;
    }
}