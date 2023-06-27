import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (String s : id_list)
            map1.put(s, new HashSet<>());

        for (String s : report) {
            String[] a = s.split(" ");
            if(!set.contains(s)){
                map1.get(a[0]).add(a[1]);
                map2.put(a[1], map2.getOrDefault(a[1], 0) + 1);
                set.add(s);
            }
        }

        int idx = 0;
        for (int i = 0; i < id_list.length; i++) {
            Set<String> a = map1.get(id_list[i]);
            for (String elem : a) {
                if (map2.getOrDefault(elem, 0) >= k) {
                    answer[idx]++;
                }
            }
            idx++;
        }
        return answer;
    }
}
