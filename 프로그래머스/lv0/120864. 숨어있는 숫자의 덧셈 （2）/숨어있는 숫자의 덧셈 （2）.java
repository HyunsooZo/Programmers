import java.util.*;
class Solution {
    public int solution(String my_string) {
        String[] nums = my_string.split("[a-zA-Z]+");
        System.out.println(Arrays.toString(nums));
        int answer = 0;
        for(String s : nums){
            if(!s.equals("")){
                answer+= Integer.parseInt(s);
            }
        }
        return answer;
    }
}