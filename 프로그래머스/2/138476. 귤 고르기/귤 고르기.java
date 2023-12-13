import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for(int i : tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.values()){
            list.add(i);
        }
        
        Collections.sort(list);
        
        int idx = list.size()-1;
        
        while(idx>=0 && k>0){
            k-=list.get(idx--);
            answer++;
        }
        
        return answer;
    }
}