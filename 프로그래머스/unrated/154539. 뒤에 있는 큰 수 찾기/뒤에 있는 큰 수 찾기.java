import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> stk = new Stack<>();
        for(int i = len-1 ; i>= 0 ; i--){
            while(!stk.isEmpty()&&numbers[i]>=stk.peek()){
                stk.pop();
            }
            answer[i] = stk.isEmpty()?-1:stk.peek();
            stk.push(numbers[i]);
        }
        return answer;
    }
}