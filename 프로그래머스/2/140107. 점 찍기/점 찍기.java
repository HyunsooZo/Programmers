class Solution {
    public static long solution(int k, int d) {
        long answer = 0;

        // x 좌표를 k의 배수로 증가시키며 점의 개수를 계산
        for (int x = 0; x <= d; x += k) {
            // 현재 x 좌표에서 y 좌표의 최대 가능 거리 계산
            int yMaxDistance = calculateYMaxDistance(x, d);
            
            // 현재 x 좌표에서 y 좌표의 가능한 점의 개수를 계산하여 정답에 추가
            answer += calculateYCount(yMaxDistance, k);
        }
        return answer;
    }

    // 현재 x 좌표에서 y 좌표의 최대 가능 거리를 계산하는 메서드
    private static int calculateYMaxDistance(int x, int d){
        // 피타고라스 정리를 사용하여 y의 최대 거리를 계산
        long xx = (long) Math.pow(x, 2); // x의 제곱
        long dd = (long) Math.pow(d, 2); // d의 제곱

        // y의 최대 가능 거리 계산
        return (int) (Math.sqrt(dd - xx));
    }

    // y 좌표의 가능한 점의 개수를 계산하는 메서드
    private static int calculateYCount(int possible, int k){
        // k의 배수인 숫자가 몇 개 있는지 계산하여 반환
        return possible / k + 1;
    }
}
