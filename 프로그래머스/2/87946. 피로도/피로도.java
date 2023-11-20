class Solution {
    static int len;
    static int[][] arr;
    static boolean[] visited;
    static int answer;

    public int solution(int k, int[][] dungeons) {
        arr = dungeons;
        len = dungeons.length;
        visited = new boolean[len];
        
        recursive(0, k);
        
        return answer;
    }

    private void recursive(int idx, int k) {
        for (int i = 0; i < len; i++) {
            if (visited[i] || arr[i][0] > k) {
                continue;
            }
            
            visited[i] = true;
            recursive(idx + 1, k - arr[i][1]);
            visited[i] = false;
            
        }
        answer = Math.max(idx, answer);
    }
}