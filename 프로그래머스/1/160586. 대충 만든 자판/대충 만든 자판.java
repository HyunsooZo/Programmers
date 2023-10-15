import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int len = keymap.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char[] keySplit = keymap[i].toCharArray();
                int curValue = map.getOrDefault(keySplit[j], Integer.MAX_VALUE);
                map.put(keySplit[j], Math.min(curValue, j+1));
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0 ;
            for (int j = 0; j < targets[i].length(); j++) {
                char[] targetSplit = targets[i].toCharArray(); 
                if(!map.containsKey(targetSplit[j])){
                    count = -1;
                    break;
                }else{
                    count += map.get(targetSplit[j]);
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
