class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] total = new int[n+1];
        
        for (int i = 1; i <= n; i++) total[i] = 1;
        
        for (int i : lost) total[i]--;
        
        for (int i : reserve) total[i]++;
        
        for (int i = 1; i <= n; i++) {
            if (total[i] == 0) {
                if (i > 1 && total[i-1] > 1) {
                    total[i]++;
                    total[i-1]--;
                } else if (i < n && total[i+1] > 1) {
                    total[i]++;
                    total[i+1]--;
                }
            }
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (total[i] >= 1) answer++;
        }
        return answer;
    }
}
