import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private String[] maps;
    private boolean[][] visited;
    private int n;
    private int m;

    public int solution(String[] maps) {
        this.maps = maps;
        n = maps.length;
        m = maps[0].length();

        int[] start = findCoordinates('S');
        int[] lever = findCoordinates('L');
        int[] exit = findCoordinates('E');

        int timeToLever = bfs(start[0], start[1], lever[0], lever[1]);
        int timeToExit = bfs(lever[0], lever[1], exit[0], exit[1]);

        if (timeToLever == -1 || timeToExit == -1) {
            return -1; 
        }

        return timeToLever + timeToExit;
    }

    private int[] findCoordinates(char target) {
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maps[i].charAt(j) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private int bfs(int startX, int startY, int targetX, int targetY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited = new boolean[n][m];

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int time = current[2];

            if (x == targetX && y == targetY) {
                return time;
            }

            visited[x][y] = true;

            for (int[] direction : directions) {
                int nx = x + direction[0];
                int ny = y + direction[1];

                if (nx >= 0 && nx < n && 
                    ny >= 0 && ny < m && 
                    !visited[nx][ny] && 
                    maps[nx].charAt(ny) != 'X') {
                    
                    queue.add(new int[]{nx, ny, time + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return -1;
    }
}
