import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        boolean contained = true;
        for(int i = 0 ; i < babbling.length ; i++ ){
            contained= true;
            babbling[i] = babbling[i].replace("aya","1").replace("ye","2").replace("woo","3").replace("ma","4");
            for(int j = 0 ; j < babbling[i].length() ; j++){
                char c = babbling[i].charAt(j);
                if(Character.isAlphabetic(c)){
                    contained = false;
                }
            }
            if(contained){
                answer++;
            }
        }
        return answer;
    }
}