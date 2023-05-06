class Solution {
    public int solution(int n) {
        int answer = 0 , start = 1;
        boolean isEven = false;
        if(n%2==0){
            isEven = true;
            start = 2;
        }else{
            start = 1;
        }
        for(int i = start ; i<=n ; i+=2){
            if(isEven) answer+=Math.pow(i,2);
            else answer+=i;
        }
        return answer;
    }
}