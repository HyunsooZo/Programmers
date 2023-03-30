import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                a.add(numbers[i] + numbers[j]);
            }
        }
        return a.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }
}