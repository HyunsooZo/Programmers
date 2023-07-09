import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = speeds.length;
        int[] left = new int[len];
        for(int i = 0 ;i < len ; i++){
            left[i] = (int)Math.ceil((100-progresses[i])/(double)speeds[i]);
        }
        List<Integer> list = new ArrayList<>();
        int cur = 1;
        int curPercent = left[0];
        for(int i = 1 ; i < len ; i++){
            if(left[i]>curPercent){
                list.add(cur);
                curPercent = left[i];
                cur=1;
            }else{
                cur++;
            }
        }
        list.add(cur);
        
        
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list){
            answer[idx++] = i;
        }
        return answer;
    }
}