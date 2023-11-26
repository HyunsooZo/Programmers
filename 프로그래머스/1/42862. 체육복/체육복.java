import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 1; i <= n; i++) {
            map.put(i, 1);
        }

        for (int i : lost) {
            map.put(i, map.get(i) - 1);
        }

        for (int i : reserve) {
            map.put(i, map.get(i) + 1);
        }

        for (int i : reserve) {
            if (map.get(i) > 1) {
                if (i > 1 && map.get(i - 1) == 0) {
                    map.put(i - 1, map.get(i-1) + 1);
                    map.put(i, map.get(i)-1);
                } else if (i < n && map.get(i + 1) == 0) {
                    map.put(i + 1, map.get(i+1) + 1);
                    map.put(i, map.get(i)-1);
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (map.get(i) > 0) {
                answer++;
            }
        }

        return answer;
    }
}
