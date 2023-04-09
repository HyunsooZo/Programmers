import java.util.*;
class Solution {
        public int solution(int[][] lines) {
        int[] temp = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) temp[j]++;
        }
        return (int)Arrays.stream(temp).filter(x->x>1).count();
    }
}