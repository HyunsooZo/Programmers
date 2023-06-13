class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = arr.length;
        int queryLen = queries.length;
        int[] answer = new int[queryLen];
        
        for (int i = 0; i < queryLen; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for (int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            
            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        
        return answer;
    }
}
