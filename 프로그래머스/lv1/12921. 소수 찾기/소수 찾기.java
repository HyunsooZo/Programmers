import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] a = IntStream.range(2,n+1).toArray();
        for(int i : a){
            boolean isPrime = true;
            for(int j = 2 ; j<=Math.sqrt(i) ; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                answer++;
            }
        }
        return answer;
    }
}