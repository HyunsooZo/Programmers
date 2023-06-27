class Solution {
    public int[] solution(int[] sequence, int k) {
        int len = sequence.length,left = 0, right = 0,sum = sequence[left];
        int[] answer = new int[2];
        int minLen = Integer.MAX_VALUE;
        
        while (left <= right && right < len) {
            if (sum == k) {
                int tempLen = right - left + 1;
                if (tempLen < minLen) {
                    answer = new int[]{left,right};
                    minLen = tempLen;
                }
                sum -= sequence[left++];
            } else if (sum < k) {
                right++;
                if (right < len) {
                    sum += sequence[right];
                }
            } else {
                sum -= sequence[left++];
            }
        }
        return answer;
    }
}
