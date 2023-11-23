import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();
        
        for (char c : X.toCharArray()) {
            countX.put(c, countX.getOrDefault(c, 0) + 1);
        }
        
        for (char c : Y.toCharArray()) {
            countY.put(c, countY.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder result = new StringBuilder();
        
        for (char c = '9'; c >= '0'; c--) { 
            if (countX.containsKey(c) && countY.containsKey(c)) {
                int min = Math.min(countX.get(c), countY.get(c));
                while (min > 0) {
                    result.append(c);
                    min--;
                }
            }
        }
        
        if (result.length() == 0) {
            return "-1"; 
        }
        
        return result.toString().startsWith("0")?"0":result.toString();
    }
}
