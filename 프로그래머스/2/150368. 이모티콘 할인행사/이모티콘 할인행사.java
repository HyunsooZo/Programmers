class Solution {
    // 가능한 할인율 배열
    static int[] discountRates = {10, 20, 30, 40};
    // 최대 가입자 수
    static int maxOfSubscribe;
    // 최대 판매 금액
    static int maxOfCost;

    
    public int[] solution(int[][] users, int[] emoticons) {
        // 이모티콘 수
        int emoticonLength = emoticons.length;
        // 할인율 배열 초기화
        int[] discounts = new int[emoticonLength];

        // 할인율 배열 초기값 설정
        for (int i = 0; i < emoticonLength; i++) {
            discounts[i] = discountRates[0];
        }

        // 계산 시작
        calculate(0, emoticonLength, discounts, users, emoticons);

        // 결과 반환
        return new int[]{maxOfSubscribe, maxOfCost};
    }

    // 가능한 할인율 조합 계산 함수
    public void calculate(int index, int emoticonLength, int[] discounts, int[][] users, int[] emoticons) {
        // 할인율 배열이 모두 설정되면
        if (index == emoticonLength) {
            // 가입자 수와 판매 금액 계산
            int subscribe = 0;
            int cost = 0;

            // 모든 사용자에 대해 처리
            for (int[] user : users) {
                int userDiscountRate = user[0];
                int userMaxCost = user[1];
                int totalCost = 0;

                // 사용자별로 구매 가능한 이모티콘 금액 계산
                for (int i = 0; i < emoticonLength; i++) {
                    if (discounts[i] >= userDiscountRate) {
                        totalCost += emoticons[i] / 100 * (100 - discounts[i]);
                    }
                }

                // 구매 조건 확인 후 가입자 수 및 판매 금액 갱신
                if (totalCost >= userMaxCost) {
                    subscribe++;
                } else {
                    cost += totalCost;
                }
            }

            // 최적의 결과 확인 및 업데이트
            if (subscribe > maxOfSubscribe) {
                maxOfSubscribe = subscribe;
                maxOfCost = cost;
            } else if (subscribe == maxOfSubscribe) {
                maxOfCost = Math.max(maxOfCost, cost);
            }
            return;
        }

        // 가능한 모든 할인율에 대해 조합 탐색
        for (int rate : discountRates) {
            discounts[index] = rate;
            //재귀
            calculate(index + 1, emoticonLength, discounts, users, emoticons);
        }
    }
}
