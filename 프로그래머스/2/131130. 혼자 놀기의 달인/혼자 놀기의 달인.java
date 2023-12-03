import java.util.*;

class Solution {
    static List<Integer> list = new ArrayList<>();
    static boolean[] visited;

    public int solution(int[] cards) {
        int len = cards.length;
        visited = new boolean[len];

        for (int i = 0; i < len; i++) {
            dfs(cards, i, 0);
        }

        if (list.size() == 1) {
            return 0;
        }

        Collections.sort(list, Collections.reverseOrder());

        return list.get(0) * list.get(1);
    }

    private void dfs(int[] cards, int idx, int cnt) {
        if (visited[idx]) {
            list.add(cnt);
            return;
        }
        visited[idx] = true;
        dfs(cards, cards[idx] - 1, cnt + 1);
    }
}
