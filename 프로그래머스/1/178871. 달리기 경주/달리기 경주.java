import java.util.*;

class Solution {
    static Map<String, Integer> map1 = new HashMap<>();
    static Map<Integer, String> map2 = new HashMap<>();

    public String[] solution(String[] players, String[] callings) {
        populateMaps(players);

        for (String calling : callings) {
            movePlayer(calling);
        }

        return toArray();
    }

    private static void populateMaps(String[] players) {
        for (int i = 0; i < players.length; i++) {
            map1.put(players[i], i + 1);
            map2.put(i + 1, players[i]);
        }
    }

    private static void movePlayer(String calling) {
        int curIdx = map1.get(calling);
        String backName = map2.get(curIdx - 1);
        map2.put(curIdx, backName);
        map2.put(curIdx - 1, calling);
        map1.put(calling, curIdx - 1);
        map1.put(backName, curIdx);
    }

    private static String[] toArray() {
        String[] answer = new String[map1.size()];

        map2.forEach((idx, name) -> answer[idx - 1] = name);

        return answer;
    }
}
