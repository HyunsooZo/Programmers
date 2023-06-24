import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : array) hm.put(i,hm.getOrDefault(i,0)+1);
        int max = Collections.max(hm.values());
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue()==max){
                if(answer==0){
                    answer = entry.getKey();
                    }else{
                    return -1;
                }
            }
        }
        return answer;
    }
}
