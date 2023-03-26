import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        Arrays.sort(array);
        int a = 0;
        for(int i : array){
            if(Math.abs(i-n)<answer){
            answer = Math.abs(i-n);
            a = i; 
            }
        }
        return a;
    }
}