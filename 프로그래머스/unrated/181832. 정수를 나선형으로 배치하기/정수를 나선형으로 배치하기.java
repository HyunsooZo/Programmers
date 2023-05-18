class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        int num = 1, dir = 0, r = 0, c = 0;
        
        while (num <= n * n) {
            answer[r][c] = num++;
            
            int tempR = r + dx[dir];
            int tempC = c + dy[dir];
            
            if (tempR < 0 || tempR >= n 
                || tempC < 0 || tempC >= n 
                || answer[tempR][tempC] != 0) {
                dir = (dir + 1) % 4;
            }
            
            r += dx[dir];
            c += dy[dir];
        }
        
        return answer;
    }
}
