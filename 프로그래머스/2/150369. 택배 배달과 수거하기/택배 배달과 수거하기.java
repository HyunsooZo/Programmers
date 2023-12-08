class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0, deliver = 0, pickup = 0;

        // 각집 방문
        for (int i = 0; i < n; i++) {
            int count = 0;
            deliver -= deliveries[n - 1 - i];
            pickup -= pickups[n - 1 - i];

            // 음수면 카운트(이동횟수) 추가! 캐파시티 만큼 박스리필!
            while (deliver < 0 || pickup < 0) {
                count++;
                deliver += cap;
                pickup += cap;
            }

            // 이동횟수 * (2*거리(왕복이니까)) 더함!
            answer += count * (2 * (n - i));
        }
        return answer;
    }
}
