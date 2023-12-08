import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            // 스택이 비어있지 않고, 스택의 가장 위의 문자가 현재 문자보다 작고, 아직 삭제해야 할 숫자가 남아있는 경우
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop(); // 스택에서 가장 위의 문자를 제거
                k--; // 삭제한 숫자 개수 감소
            }
            stack.push(c); // 현재 문자를 스택에 추가
        }

        // 삭제할 숫자가 남아있는 경우, 스택의 뒤쪽에서부터 삭제
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        // 스택에 남은 문자들을 결과 문자열에 추가
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString(); 
    }
}
