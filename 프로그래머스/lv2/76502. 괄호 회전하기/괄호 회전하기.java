import java.util.*;

class Solution {
    static int answer = 0;

    public int solution(String s) {
        int len = s.length();

        Deque<Character> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            queue.offerLast(s.charAt(i));
        }

        int cnt = 0;
        while (cnt < queue.size()) {
            isProper(queue);
            queue.offerLast(queue.pollFirst());
            cnt++;
        }

        return answer;
    }

    public static void isProper(Deque<Character> queue) {
        Stack<Character> stack = new Stack<>();
        for (char c : queue) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                char top = stack.peek();
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if ((top == '(' && c == ')') || 
                           (top == '[' && c == ']') || 
                           (top == '{' && c == '}')) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            answer++;
        }
    }
}
