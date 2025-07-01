import java.util.*;

class Solution {
    
    // 위, 아래, 좌, 우
    private static final int[] dRow = {-1, 1, 0, 0}; 
    private static final int[] dCol = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        var height = maps.length;
        var width = maps[0].length;
        var visited = new boolean[height][width];
        var distance = new int[height][width];
        var queue = new LinkedList<int[]>();
        
        visited[0][0] = true;
        distance[0][0] = 1;
        queue.add(new int[]{0, 0});
        
        while (!queue.isEmpty()) {
            var current = queue.poll();
            var row = current[0];
            var col = current[1];
            
            if (row == height - 1 && col == width - 1) {
                return distance[row][col];
            }
            
            for (var direction = 0; direction < 4; direction++) {
                var newRow = row + dRow[direction];
                var newCol = col + dCol[direction]; 
                
                if (newRow < 0 || 
                    newRow >= height || 
                    newCol < 0 || 
                    newCol >= width
                ){
                    continue;
                }
                
                if (visited[newRow][newCol] || maps[newRow][newCol] == 0) {
                    continue;
                }
                
                visited[newRow][newCol] = true;
                distance[newRow][newCol] = distance[row][col] + 1;
                queue.add(new int[]{newRow, newCol});
            }
        }
        
        return -1;
    }
}
