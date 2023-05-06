class Solution {
    public int solution(int a, int b) {
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        int c = Integer.parseInt(A+B);
        int d = Integer.parseInt(B+A);
        return Math.max(c,d);
    }
}