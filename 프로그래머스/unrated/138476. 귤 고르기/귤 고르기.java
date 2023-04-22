import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> entity = new HashMap<>();
        for (int i : tangerine) entity.put(i, entity.getOrDefault(i, 0) + 1);

        ArrayList<Integer> entityList = new ArrayList<>(entity.values());
        Collections.sort(entityList, Comparator.reverseOrder());

        for (int i : entityList) {
            k -= i;
            answer++;
            if (k <= 0) break;
        }
        return answer;
    }
}
