import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (check(s)) {
                answer++;
            }
            s = rotateString(s);
        }
        
        return answer;
    }
    
    // 문자열을 왼쪽으로 한 칸 회전
    private String rotateString(String s) {
        StringBuilder sb = new StringBuilder(s);
        char firstChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(firstChar);
        return sb.toString();
    }
    
    // 괄호가 올바른지 확인
    // 괄호가 여는거면 일단 추가 
    // 뒤에 여는괄호가 아닌데 스택이 비어있거나 가장최근 여는괄호와 일치하지않으면 false
    // 만약 일치하고 스택 다썼으면 true
    private boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
