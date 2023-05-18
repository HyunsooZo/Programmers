class Solution {
    public int solution(int a, int b) {
        int ans1 = 2*a*b;
        int ans2 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        return ans1>ans2?ans1:ans2;
    }
}