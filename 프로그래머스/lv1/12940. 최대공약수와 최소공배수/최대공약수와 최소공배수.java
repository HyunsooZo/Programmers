import java.math.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);
        answer[0] = a.gcd(b).intValue();
        answer[1] = n*m /answer[0];
        return answer;
    }
}