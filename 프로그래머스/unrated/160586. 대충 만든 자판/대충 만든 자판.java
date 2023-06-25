import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            String Chars = keymap[i];
            for (int j = 0; j < Chars.length(); j++) {
                char c = Chars.charAt(j);
                map.put(c,Math.min(
                    map.getOrDefault(c, Integer.MAX_VALUE), j + 1)
                       );
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int totalPresses = 0;
            boolean exists = true;
            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if (map.containsKey(c)) {
                    totalPresses += map.get(c);
                } else {
                    exists = false;
                    break;
                }
            }
            answer[i] = exists ? totalPresses : -1;
        }

        return answer;
    }
}
