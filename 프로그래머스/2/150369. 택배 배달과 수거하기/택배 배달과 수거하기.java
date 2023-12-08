class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0, deliver = 0, pickup = 0;

        // 뒤부터 훑으면 반복문 하나로 풀이가능
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            deliver -= deliveries[i];
            pickup -= pickups[i];

            //음수면 카운트(이동횟수) 추가! 캐파시티 만큼 박스리필!
            while (deliver < 0 || pickup < 0) {
                count++;
                deliver += cap;
                pickup += cap;
            }

            //이동횟수 * (2*거리(왕복이니까)) 더함. 
            answer += count * (2 * (i + 1));
        }
        return answer;
    }
}
