import java.util.*;
class Solution {
    static Map<String,Integer> map = new HashMap<>();
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        for(int i = 0 ; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        int idx = 0;
        
        for(String[] i : photo){
            int temp = 0; 
            for(String s : i){
                temp += map.getOrDefault(s,0);
            }
            answer[idx++] = temp;
        }
        return answer;
    }
}