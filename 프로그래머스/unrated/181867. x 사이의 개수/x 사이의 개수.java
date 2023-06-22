import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int x = 0, cnt = 0 , idx = 0;
        while(idx<=myString.length()-1){
            if(myString.charAt(idx++)=='x'){
                x++;
                list.add(cnt);
                cnt = 0;
            }else{
                cnt++;
            }
            if(idx==myString.length()){
                list.add(cnt);
            }
        }
        idx = 0;
        int[] answer = new int[list.size()];
        for(int i : list) answer[idx++]=i; 
        return answer;
    }
}