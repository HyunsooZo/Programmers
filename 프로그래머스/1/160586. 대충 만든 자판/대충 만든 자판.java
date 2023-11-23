import java.util.*;

class Solution {
    Map<Character, Integer> map = new HashMap<>();

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                map.put(keymap[i].charAt(j),
                        Math.min(
                            map.getOrDefault(keymap[i].charAt(j), 101),
                            j + 1
                        )
                    );
            }
        }
        boolean isNone = false;
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                int a = map.getOrDefault(targets[i].charAt(j),-1);
                if(a==-1){
                    isNone = true;
                }
                sum += a;
            }
            answer[i] = isNone?-1:sum;
            isNone = false;
        }
        
        return answer;
    }
}
