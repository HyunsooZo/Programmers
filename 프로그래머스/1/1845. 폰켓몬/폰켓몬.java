import java.util.*;

class Solution {
    public int solution(int[] nums) {
        var pocketmonKinds = new HashSet<Integer>();
        for (var pocketmon : nums) {
            pocketmonKinds.add(pocketmon);
        }
        return Math.min(pocketmonKinds.size(), nums.length / 2);
    }
}