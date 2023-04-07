import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = n;
        for(int i = 2 ; i <= a ; i++ ){
              while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }
        return list.stream().mapToInt(Integer::intValue).distinct().sorted().toArray();
    }
}