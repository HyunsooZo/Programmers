import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0)==')'){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i ++){
            char elem = s.charAt(i);
            if(elem=='('){
                stack.push(elem);    
            }else if(!stack.isEmpty()&& elem==')'){
                stack.pop();
            }else if(stack.isEmpty()){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}