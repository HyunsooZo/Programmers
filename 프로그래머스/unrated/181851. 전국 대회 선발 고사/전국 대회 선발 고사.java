import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int len = rank.length;

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            if (attendance[i]) list.add(new int[]{rank[i], i});
        }
        
        Collections.sort(list, Comparator.comparingInt(arr -> arr[0]));
        
        return list.get(0)[1] * 10000 
            + list.get(1)[1] * 100 
            + list.get(2)[1];
    }
}
