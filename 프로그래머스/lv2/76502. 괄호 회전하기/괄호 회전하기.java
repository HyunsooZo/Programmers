import java.util.*;

class Solution {
    static int answer=0;
    public int solution(String s) {
        if(s.length()%2!=0){
            return 0;
        }
        Deque<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
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
    public static void isProper(Deque<Character> queue){
        Stack<Character> stack = new Stack<>();
        for (char c : queue) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return;
                }
                char top = stack.peek();
                if ((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')) {
                    stack.pop();
                } else {
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            answer++;
        }
    }
}