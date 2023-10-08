import java.util.*;
class Solution {
    public int solution(String s) {
       Map<String,String> a = new HashMap<>();
            a.put("zero","0");
            a.put("one","1");
            a.put("two","2");
            a.put("three","3");
            a.put("four","4");
            a.put("five","5");
            a.put("six","6");
            a.put("seven","7");
            a.put("eight","8");
            a.put("nine","9");
        for(String string : a.keySet()){
            s = s.replaceAll(string,a.get(string));
        }
        return Integer.parseInt(s);
    }
}