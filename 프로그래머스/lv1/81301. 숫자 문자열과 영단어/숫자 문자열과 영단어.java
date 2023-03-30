import java.util.*;
class Solution {
    public int solution(String s) {
        ArrayList<String> a = new ArrayList<>();
        a.add("zero");
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("five");
        a.add("six");
        a.add("seven");
        a.add("eight");
        a.add("nine");
        for(int i = 0; i< a.size(); i++){
            if(s.contains(a.get(i))){
                s = s.replace(a.get(i),String.valueOf(a.indexOf(a.get(i))));
            }
        }
        return Integer.parseInt(s);
    }
}