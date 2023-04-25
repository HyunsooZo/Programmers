import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<List<Integer>> tuples = new ArrayList<>();
        String[] sets = s.substring(2, s.length() - 2).split("\\},\\{");
        for (String set : sets) {
            String[] nums = set.split(",");
            List<Integer> tuple = new ArrayList<>();
            for (String num : nums) {
                tuple.add(Integer.parseInt(num));
            }
            tuples.add(tuple);
        }

        Collections.sort(tuples, (a, b) -> a.size() - b.size());
        Set<Integer> uniqueNums = new HashSet<>();
        int[] answer = new int[tuples.size()];
        int index = 0;
        for (List<Integer> tuple : tuples) {
            for (int num : tuple) {
                if (uniqueNums.add(num)) {
                    answer[index++] = num;
                }
            }
        }

        return answer;
    }
}
