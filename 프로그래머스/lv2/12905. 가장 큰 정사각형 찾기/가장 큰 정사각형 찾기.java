class Solution {
    public int solution(int[][] board) {
        int row = (board != null) ? board.length : 0;
        int col = (row > 0) ? board[0].length : 0;

        if (row == 1 || col == 1) return 1;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) dp[i][0] = board[i][0];
        for (int i = 0; i < col; i++) dp[0][i] = board[0][i];

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (board[i][j] == 1) {
                    dp[i][j] = Math.min(
                        Math.min(dp[i-1][j], dp[i][j-1]), 
                        dp[i-1][j-1]) + 1;
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                max = Math.max(max, dp[i][j]);
            }
        }

        return max * max;
    }
}
