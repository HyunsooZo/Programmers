import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] map = new int[100001];
        String[] arr = s.substring(2,s.length()-2).split("\\}\\,\\{");
        for(String str : arr){
            String[] temp = str.split(",");
            for(String t : temp){
                map[Integer.parseInt(t)]++;
            }
        }
        
        int max = 1;
        for(int i : map){
            if(i>max){
                max = i;
            }
        }
        int answerIdx = 0;
        int[] answer = new int[arr.length];
        
        while(true){
            for(int i = 0 ; i < 100001 ; i++){
                if(answerIdx < arr.length && map[i]==max){
                    answer[answerIdx++] = i;
                    max--;
                }
            }
            if(max<1){
                break;
            }
        }
        return answer;
    }
}