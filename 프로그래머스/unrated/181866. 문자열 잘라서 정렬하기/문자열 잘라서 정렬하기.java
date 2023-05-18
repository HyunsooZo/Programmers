import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] a = myString.split("x");
        for(String s : a) if(!s.equals("")) list.add(s); 
        Collections.sort(list);
        String[] b = new String[list.size()];
        int i = 0;
        for(String s : list){
            b[i++] = s;
        }
        return b;
    }
}