import java.util.*;
class Solution {
    public int[] solution(String s) {
        Map<String,Integer> map = new HashMap<>();
        String[] arr = s.substring(2,s.length()-2).split("\\}\\,\\{");
        for(String str : arr){
            String[] temp = str.split(",");
            for(String t : temp){
                map.put(t,map.getOrDefault(t,0)+1);
            }
        }
        
        int max = 1;
        for(int i : map.values()){
            if(i>max){
                max = i;
            }
        }
        int answerIdx = 0;
        int[] answer = new int[arr.length];
        
        while(true){
            for(String k : map.keySet()){
                if(answerIdx < arr.length && map.get(k)==max){
                    answer[answerIdx++] = Integer.parseInt(k);
                    max--;
                    break;
                }
            }
            if(max<1){
                break;
            }
        }
        return answer;
    }
}