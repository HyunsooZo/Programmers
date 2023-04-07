import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int[] x = new int[4] ,y = new int[4];
        for(int i = 0 ; i<dots.length ; i++) {
            x[i] = dots[i][0];
            y[i] = dots[i][1];
        }
        int xMax = Arrays.stream(x).max().getAsInt();
        int xMin = Arrays.stream(x).min().getAsInt();
        int yMax = Arrays.stream(y).max().getAsInt();
        int yMin = Arrays.stream(y).min().getAsInt();
        
        return Math.abs(xMax-xMin) * Math.abs(yMax-yMin);
    }
}