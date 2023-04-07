class Solution {
    public int solution(int[] sides) {
        int count = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for (int i = 0; i <= max+min; i++) {
            if (i > max-min && i < max+min) {
                count++;
            }
        }
        return count;
    }
}
