import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String,Integer> map = new HashMap<>();
        int len = name.length ,len2 = photo.length;
        for(int i = 0 ; i < len ; i++) map.put(name[i],yearning[i]);
        
        int[] answer = new int[len2];
        
        for(int i = 0 ; i < len2 ; i++){
            int temp = 0;
            for(int j = 0 ; j < photo[i].length ; j++){
                if(map.containsKey(photo[i][j])) temp+=map.get(photo[i][j]);
            }
            answer[i] = temp;
        }
        return answer;
    }
}