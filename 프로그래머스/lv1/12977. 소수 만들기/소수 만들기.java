import java.util.*;
class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = i+1 ; j < nums.length; j++){
               for (int k = j+1; k <nums.length; k++) {
                    int a = nums[i]+nums[j]+nums[k];
                    list.add(a);
                }
            }
        }
        for(int z : list){
            boolean ify = true;
            for(int i = 2 ; i<=Math.sqrt(z) ; i++ ){
                if(z%i==0){
                    ify = false;
                    break;
                }
            }
            if(ify){
                answer++;
            }
        }
        
        return answer;
    }
}