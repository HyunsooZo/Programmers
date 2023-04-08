class Solution {
    public int[] solution(int num, int total) {
        int mid = total/num;
        int numberOf = num%2==0?num/2-1:num/2;
        int cnt= 0;
        int[] answer = new int[num];
        int idx = 0;
        for(int i = mid-numberOf ; cnt <num ; i++) {
            answer[idx++]=i;
            cnt++;
        }
        return answer;
    }
}