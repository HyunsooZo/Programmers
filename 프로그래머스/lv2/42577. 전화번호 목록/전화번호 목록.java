import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        String check = phone_book[0];
        
        for(String s : phone_book){
            if(s.startsWith(check)&&!s.equals(check)){
                answer = false;
                break;
            }
            check = s;
        }
        return answer;
    }
}