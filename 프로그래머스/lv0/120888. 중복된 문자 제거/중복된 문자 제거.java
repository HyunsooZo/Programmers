import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String answer = "";
        for(int i = 0 ; i< str.length ; i++){
            if(!answer.contains(str[i])){
                answer += str[i];
            }
        }
        return answer;
    }
}