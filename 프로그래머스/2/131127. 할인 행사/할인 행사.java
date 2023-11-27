import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wishList = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wishList.put(want[i], number[i]);
        }
        
        int answer = 0;
        int days = 10;
        int promoLength = discount.length;

        for (int start = 0; start <= promoLength - days; start++) {
            Map<String, Integer> promoCnt = new HashMap<>(wishList);
            boolean doesItMet = true;

            for (int end = start; end < start + days; end++) {
                String item = discount[end];
                
                if (!promoCnt.containsKey(item) || promoCnt.get(item) <= 0) {
                    doesItMet = false;
                    break;
                } else {
                    promoCnt.put(item, promoCnt.get(item) - 1);
                }
            }
            
            if (doesItMet) {
                answer++;
            }
        }
        
        return answer;
    }
}
