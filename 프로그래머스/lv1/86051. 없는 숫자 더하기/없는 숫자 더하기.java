class Solution {
    public int solution(int[] numbers) {
        int[] nums = new int[10];
        for(int i : numbers) nums[i]++;
        int answer = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==0) answer+=i;
        }
        return answer;
    }
}