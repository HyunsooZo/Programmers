class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[31];
        int answer = 0;
        
        for(String s : strArr){
            cnt[s.length()]++;
        }
        
        for(int i : cnt){
            answer = Math.max(answer,i);
        }
        
        return answer;
    }
}