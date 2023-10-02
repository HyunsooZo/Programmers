class Solution {
    public int solution(int n) {
        int count = 0;
        int num = 1;

        while (true) {
            if (count == n) {
                return num - 1;
            }

            if (num % 3 != 0 && !containsDigit(num, 3)) {
                count++;
            }
            num++;
        }
    }

    private boolean containsDigit(int num, int digit) {
        while (num > 0) {
            if (num % 10 == digit) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
