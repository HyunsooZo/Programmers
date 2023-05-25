class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] helper = new int[included.length];
        int elem = a , answer =0;
        helper[0] = elem;
        for(int i = 1 ; i < helper.length ; i++){
            helper[i] = helper[i-1] + d;
        }
        for(int i = 0 ; i < included.length ;i++){
            if(included[i]){
                answer+=helper[i];
            }
        }
        return answer;
    }
}