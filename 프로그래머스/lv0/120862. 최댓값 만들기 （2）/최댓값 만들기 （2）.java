import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int max1 = numbers[len-1] * numbers[len-2];
        int max2 = numbers[0] * numbers[1];
        return Math.max(max1, max2);
    }
}