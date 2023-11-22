import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        
        char[] arr = s.toCharArray();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : arr) {
            if (map.get(c) == 1) {
                answer += c;
            }
        }
        
        List<String> tempList = Arrays.asList(answer.split(""));
        Collections.sort(tempList);
        return String.join("", tempList);
    }
}
