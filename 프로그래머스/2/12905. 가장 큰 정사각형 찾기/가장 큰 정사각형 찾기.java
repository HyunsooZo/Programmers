class Solution{
    public int solution(int [][]board){
        int answer = 0;
        int len = board.length;
        int len2 = board[0].length;

        int[][] dp = new int[len][len2];
        
        for(int i = 0 ; i < len ; i++){
            //첫열복사
            dp[i][0] = board[i][0];
            answer = Math.max(answer,board[i][0]);
        
        }
          
        for(int i = 0 ; i < len2 ; i++){
            //첫행복사
            dp[0][i] = board[0][i];
            answer = Math.max(answer,board[0][i]);
        }
        
        
        for(int i = 1 ; i < len ; i++){
            for(int j = 1 ; j < len2 ; j++){
                // 대각선/위/왼쪽 중 최솟값 +1 대입
                if(board[i][j]==1){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                    answer = Math.max(answer,dp[i][j]);    
                }
            }
        }
        return answer*answer;
    }
}