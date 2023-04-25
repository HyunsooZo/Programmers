import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<List<Integer>> tuples = new ArrayList<>();
        String[] sArr = s.substring(2, s.length() - 2).split("\\},\\{");
        for (String str : sArr) {
            String[] nums = str.split(",");
            ArrayList<Integer> tuple = new ArrayList<>();
            for (String num : nums) {
                tuple.add(Integer.parseInt(num));
            }
            tuples.add(tuple);
        }

        Collections.sort(tuples, (a, b) -> a.size() - b.size());
        Set<Integer> temp = new HashSet<>();
        int[] answer = new int[tuples.size()];
        int index = 0;
        for (List<Integer> tuple : tuples) {
            for (int num : tuple) {
                if (temp.add(num)) {
                    answer[index++] = num;
                }
            }
        }

        return answer;
    }
}
