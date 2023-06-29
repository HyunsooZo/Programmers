class Solution {
    int[] numbers;
    int target;
    int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        this.target = target;
        this.numbers = numbers;
        dfs(0,0);
        return answer;
    }
    public void dfs(int idx , int sum){
        if(idx == numbers.length){
            if(sum==target){
                answer++;
            }
            return;
        }
            
        dfs(idx+1,sum-numbers[idx]);
        dfs(idx+1,sum+numbers[idx]);
    }
}