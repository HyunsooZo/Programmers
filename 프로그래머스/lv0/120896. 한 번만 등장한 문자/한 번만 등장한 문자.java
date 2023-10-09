import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : map.keySet()){
            sb.append(map.get(c)==1?c:"");
        }
        
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        return new String(chars);    
    }
}