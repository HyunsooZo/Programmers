
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int roller = section[0];
        for(int i = 1 ; i < section.length ; i++){
            if(roller+m-1 < section[i]){
                roller = section [i];
                answer++;
            }          
        }
        return answer+1;
    }
}