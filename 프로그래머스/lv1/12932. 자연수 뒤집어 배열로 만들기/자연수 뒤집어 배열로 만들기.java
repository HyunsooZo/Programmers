import java.util.*;
class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String[] st = sb.reverse().toString().split("");
        return Arrays.stream(st).mapToInt(Integer::parseInt).toArray();
    }
}