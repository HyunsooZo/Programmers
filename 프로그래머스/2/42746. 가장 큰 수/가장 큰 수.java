import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        if (Arrays.stream(numbers).allMatch(num -> num == 0)) {
            return "0";
        }
        String[] answer = Arrays.stream(numbers)
            .boxed()
            .sorted((o1,o2)-> {
                String oo1 = String.valueOf(o1);
                String oo2 = String.valueOf(o2);
                return (oo2+oo1).compareTo(oo1+oo2);
            })
            .map(Object::toString)
            .toArray(String[]::new);
        
        return String.join("",answer);
    }
}