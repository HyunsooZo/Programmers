import java.util.*;

class Solution {
    
    private static final int[] ROW_OFFSETS = {-1, 1, 0, 0};
    private static final int[] COL_OFFSETS = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        var numRows = maps.length;
        var numCols = maps[0].length;
        var visited = new boolean[numRows][numCols];
        var distance = new int[numRows][numCols];
        var queue = new LinkedList<int[]>();

        // 시작점 초기화 (row=0, col=0)
        visited[0][0] = true;
        distance[0][0] = 1;
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            var currentRowAndCol = queue.poll();
            var currentRow = currentRowAndCol[0];
            var currentCol = currentRowAndCol[1];

            // 도착지에 도달했으면 거리 반환
            if (currentRow == numRows - 1 && currentCol == numCols - 1) {
                return distance[currentRow][currentCol];
            }

            // 4방향 탐색
            for (var direction = 0; direction < 4; direction++) {
                var newRow = currentRow + ROW_OFFSETS[direction];
                var newCol = currentCol + COL_OFFSETS[direction];

                // 범위 벗어남 체크
                if (newRow < 0 || newRow >= numRows || newCol < 0 || newCol >= numCols) {
                    continue;
                }
                // 이미 방문했거나 벽이면 패스
                if (visited[newRow][newCol] || maps[newRow][newCol] == 0) {
                    continue;
                }

                // 새 칸 방문 처리
                visited[newRow][newCol] = true;
                distance[newRow][newCol] = distance[currentRow][currentCol] + 1;
                queue.add(new int[]{newRow, newCol});
            }
        }

        // 도달 못 하면 -1 반환
        return -1;

    }
}