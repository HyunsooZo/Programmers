import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        var answer = new int[commands.length];
        for (var index = 0; index < commands.length; index++) {
            var start = commands[index][0];
            var end = commands[index][1];
            var K = commands[index][2];            
            var slice = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(slice);
            answer[index] = slice[K - 1];
        }
        return answer;
    }
}