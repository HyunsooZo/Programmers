import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int idx = 0;
        for(int i = 0 ; i< array.length ; i++) {
            if(array[i]==max) idx = i;
            }
        return new int[] {max,idx};
    }
}