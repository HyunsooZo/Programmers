class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int sum = brown + yellow;
        for (int i = (int)Math.sqrt(sum); i >= 1; i--) {
            if (sum % i == 0) {
                int j = sum / i;
                int temp_brown = (i + j) * 2 - 4;
                int temp_yellow = sum - temp_brown;
                if (temp_brown == brown && temp_yellow == yellow) {
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }
}
