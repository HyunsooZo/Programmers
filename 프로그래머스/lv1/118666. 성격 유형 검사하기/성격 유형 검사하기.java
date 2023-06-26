import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<String, Integer> map = new HashMap<>();
        String[] key = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int keyLen = key.length, surveyLen = survey.length;
        
        for (int i = 0; i < keyLen; i++) {
            map.put(key[i], 0);
        }

        for (int i = 0; i < surveyLen; i++) {
            String[] temp = survey[i].split("");
            
            if (choices[i] > 4) {
                map.put(temp[1], map.get(temp[1]) + choices[i] - 4);
            } else if (choices[i] < 4) {
                map.put(temp[0], map.get(temp[0]) + 4 - choices[i]);
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < keyLen - 1; i += 2) {
            if (map.get(key[i]) < map.get(key[i + 1])) {
                answer.append(key[i + 1]);
            } else {
                answer.append(key[i]);
            }
        }
        
        return answer.toString();
    }
}
