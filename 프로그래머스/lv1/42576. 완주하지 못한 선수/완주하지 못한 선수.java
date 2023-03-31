import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> a = new HashMap<>();
        for(String s : participant){
            a.put(s,a.getOrDefault(s,0)+1);
        }
        for(String s : completion){
            a.put(s,a.get(s)-1);
        }
        for(String s : participant){
            if(a.get(s)>0){
                return s;
            }
        }
        return "";
    }
}
