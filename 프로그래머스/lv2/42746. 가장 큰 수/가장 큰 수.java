import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        if (Arrays.stream(numbers).allMatch(num -> num == 0)) {
            return "0";
        }
        Integer[] numbersBoxed = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        String[] answer = Arrays.stream(numbersBoxed).sorted((o1, o2) -> {
            String str1 = Integer.toString(o1);
            String str2 = Integer.toString(o2);
            return (str2 + str1).compareTo(str1 + str2);
        }).map(Object::toString).toArray(String[]::new);
        return String.join("", answer);
    }
}
