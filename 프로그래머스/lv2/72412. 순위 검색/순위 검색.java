import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        Map<String, List<Integer>> infoMap = new HashMap<>();

        for (String i : info) {
            String[] temp = i.split(" ");
            int score = Integer.parseInt(temp[4]);

            // 조건 조합 생성
            for (int j = 0; j < (1 << 4); j++) {
                StringBuilder keyBuilder = new StringBuilder();
                for (int k = 0; k < 4; k++) {
                    if ((j & (1 << k)) > 0) {
                        keyBuilder.append(temp[k]);
                    } else {
                        keyBuilder.append("-");
                    }
                }
                String key = keyBuilder.toString();
                infoMap.putIfAbsent(key, new ArrayList<>());
                infoMap.get(key).add(score);
            }
        }

        for (List<Integer> scores : infoMap.values()) {
            Collections.sort(scores);
        }

        for (int i = 0; i < query.length; i++) {
            String[] temp = query[i].replace(" and", "").split(" ");
            String key = String.join("", temp[0], temp[1], temp[2], temp[3]);
            int target = Integer.parseInt(temp[4]);

            if (infoMap.containsKey(key)) {
                List<Integer> scores = infoMap.get(key);

                int left = 0;
                int right = scores.size();

                while (left < right) {
                    int mid = (left + right) / 2;
                    if (scores.get(mid) >= target) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                answer[i] = scores.size() - left;
            }
        }

        return answer;
    }
}
