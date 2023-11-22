import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : array){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = Collections.max(map.values());
        int cnt = 0;
        int answer = 0;
        for(int i : map.keySet()){
            if(map.get(i)==max){
                cnt++;
                answer = i;
            }
        }
        return cnt>1?-1:answer;
    }
}