import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            boolean check = false;
            for(int j : delete_list){
                if(i==j){
                    check = true;
                    break;
                }
            }
            if(!check) list.add(i);
        }
        int[] answer = new int[list.size()];
        int idx=0;
        for(int i : list){
            answer[idx++] = i;
        }
        return answer;
    }
}