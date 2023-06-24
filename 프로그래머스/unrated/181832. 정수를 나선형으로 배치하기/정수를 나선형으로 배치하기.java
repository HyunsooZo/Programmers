class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx ={0,1,0,-1} , dy = {1,0,-1,0};
        int dir = 0 , row = 0 , col = 0 , num = 1;
        
        while (num <= n * n) {
            answer[row][col] = num++;

            int tempR = row + dx[dir];
            int tempC = col + dy[dir];

            if (tempR < 0 || tempR >= n 
                || tempC < 0 || tempC >= n 
                || answer[tempR][tempC] != 0) {
                dir = (dir + 1) % 4;
            }

            row += dx[dir];
            col += dy[dir];
        }

        return answer;
    }
}