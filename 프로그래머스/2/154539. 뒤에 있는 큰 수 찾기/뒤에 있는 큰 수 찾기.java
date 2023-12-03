import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();

        for (int idx = 0; idx < numbers.length; idx++) {
            int number = numbers[idx];
            /* 스택이 비어있지 않으면, 즉 스택이 차 있다면, 현재 값보다 작다면
            *  해당 인덱스에 대한 값 현재 값으로 셋팅
            */
            while (!stack.isEmpty() && numbers[stack.peek()] < number) {
                answer[stack.pop()] = number;
            }
            stack.push(idx);
        }

        return answer;
    }
}