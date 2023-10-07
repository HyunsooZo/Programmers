import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> dq = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                dq.add(c);
            } else if (c == ')'&&!dq.isEmpty() && dq.peekLast() == '(') {
                dq.pollLast(); 
            } else {
                return false;
            }
        }

        return dq.isEmpty(); 
    }
}
