import java.util.*;
class Solution{
    public int solution(int [][]board){
        int r = board.length;
        int c = board[0].length;
        
        if(r==1 || c==1) return 1;
        
        int[][] dp = new int[r][c];
        //첫열복사
        dp[0] = Arrays.copyOfRange(board[0],0,c);
        //첫행복사
        for(int i = 0 ; i < r ; i++){
            dp[i][0] = board[i][0];
        }
        //보드 반복 돌면서 만약 1이면? 전열/전행/대각선전 값 확인
        //최솟값에 1 더해서 현재 크기 (길이)확인. 
        //쭉쭉 돌면서 다름 대각선에 도달했을때 다시 크기(길이) 확인
        //1인 맨 끝부분 제곱하면? 사각형크기?
        
        int maxLen = Integer.MIN_VALUE;
        
        for(int i = 1; i < r ; i++){
            for(int j = 1; j < c ;j++){
                if(board[i][j]==1){
                    dp[i][j] = Math.min(
                        dp[i-1][j-1], //대각선전
                        Math.min(dp[i][j-1],dp[i-1][j]) // 전행/전열
                    )+1; //일더함
                    maxLen = Math.max(maxLen,dp[i][j]);
                }
            }
        }       
        return maxLen*maxLen;
    }
}