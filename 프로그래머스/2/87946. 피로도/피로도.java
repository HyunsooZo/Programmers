import java.util.*;
public class Solution {
    public int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        
        Arrays.sort(dungeons, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0] - a[1]) - (b[0] - b[1]);
            }
        });

        int[][] dp = new int[len + 1][k + 1];

        for (int i = 1; i <= len; i++) {
            for (int r = 1; r <= k; r++) {
                if (dungeons[i - 1][0] > r) {
                    dp[i][r] = dp[i - 1][r];
                } else {
                    dp[i][r] = Math.max(
                        dp[i - 1][r], 1 + dp[i - 1][r - dungeons[i - 1][1]]
                    );
                }
            }
        }
        return dp[len][k];
    }
}
