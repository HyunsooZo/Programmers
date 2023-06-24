class Solution {
    public int solution(int[][] board) {
        int answer = 0 , n = board.length , m = n-1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1||
                    i-1 >= 0 && board[i-1][j] == 1||
                    i-1 >= 0 && j+1 <= m && board[i-1][j+1] == 1||
                    i+1 <= m && j-1 >= 0 && board[i+1][j-1] == 1||
                    i+1 <= m && board[i+1][j] == 1||
                    i+1 <= m && j+1 <= m && board[i+1][j+1] == 1||
                    j+1 <= m && board[i][j+1] == 1||
                    j-1 >= 0 && board[i][j-1] == 1||
                   board[i][j] == 1) {
                    continue; 
                }
                answer++;
            }
        }
        return answer;
    }
}