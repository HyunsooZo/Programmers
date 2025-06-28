import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        var numberStrings = new String[numbers.length];
        var numberStringIndex = 0;
        for(var number : numbers){
            numberStrings[numberStringIndex++] = String.valueOf(number); 
        }
        
        Arrays.sort(numberStrings, (a,b) -> (b+a).compareTo(a+b));
        
        return String.join("",numberStrings).replaceAll("^0+", "0");
    }
}