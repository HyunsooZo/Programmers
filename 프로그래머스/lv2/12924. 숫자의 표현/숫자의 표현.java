class Solution {
    public int solution(int n) {
        int answer = 0;
        int p1 = 1;
        int p2 = p1+1;
        int sum = p1;
        while(p1<=n){
            if(sum==n){
                answer++;
                sum -= p1;
                p1++;
            }else if(sum>n){
                sum -= p1;
                p1++;
            }else{
                sum += p2;
                p2++;
            }
        }
        return answer;
    }
}
