import java.util.*;

class Solution {
    static int answer = 0;

    public int solution(String s) {
        answer = 0;
        Deque<String> queue = new LinkedList<>();
        for (int i = 0; i < s.split("").length; i++) {
            queue.offerLast(s.split("")[i]);
        }
        isProper(queue);
        for (int i = 0; i < queue.size(); i++) {
            queue.offerLast(queue.poll());
            isProper(queue);
        }
        return answer;
    }

    public boolean isProper(Deque<String> queue) {
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()) {
            String a = queue.poll();
            if (a.equals("{") || a.equals("[") || a.equals("(")) {
                if (queue.size() == 0) {
                    return false;
                } else {
                    stack.push(a);
                }
            } else if (a.equals("}") || a.equals("]") || a.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                   answer++ ;
                    stack.pop();
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
\        return true;
    }
}
