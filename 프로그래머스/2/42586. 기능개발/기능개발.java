import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        var result = new ArrayList<Integer>();
        int current = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        result.add(1); 

        for (int i = 1; i < progresses.length; i++) {
            int remaining = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            if (remaining <= current) {
                int lastIdx = result.size() - 1;
                result.set(lastIdx, result.get(lastIdx) + 1);
            } else {
                current = remaining;
                result.add(1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
