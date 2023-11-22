class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    int count = 0;
                    
                    if (i > 0 && board[i-1][j] == 1) count++;
                    if (i < n-1 && board[i+1][j] == 1) count++;
                    if (j > 0 && board[i][j-1] == 1) count++;
                    if (j < n-1 && board[i][j+1] == 1) count++;
                    if (i > 0 && j > 0 && board[i-1][j-1] == 1) count++;
                    if (i > 0 && j < n-1 && board[i-1][j+1] == 1) count++;
                    if (i < n-1 && j > 0 && board[i+1][j-1] == 1) count++;
                    if (i < n-1 && j < n-1 && board[i+1][j+1] == 1) count++;
                    
                    if (count == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}
