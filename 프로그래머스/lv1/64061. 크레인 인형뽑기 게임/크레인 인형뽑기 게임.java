import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < moves.length ; i++){
            int get = getAvailble(board,moves[i]);
            if(get==0){
                continue;
            }
            if(!stack.empty() && stack.peek() == get){
                stack.pop();
                answer+=2;
            }else{
                stack.push(get);
            }
        }
        return answer;
    }
    public int getAvailble(int[][] board,int move){
        int len= board.length, result = 0 ;
        for(int i = 0 ; i < len ; i++){
            if(board[i][move-1]!=0){
                result = board[i][move-1];
                board[i][move-1] =0;
                break;
            }
        }
        return result;
    }
}