import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String[] nephew = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            for(int j = 0 ; j < nephew.length ; j++){
                if(babbling[i].contains(nephew[j])&&!babbling[i].contains(nephew[j]+nephew[j])){
                    babbling[i] = babbling[i].replace(nephew[j],"0");
                }
            }
        }
        System.out.println(Arrays.toString(babbling));
        return (int)Arrays.stream(babbling).filter(x->x.matches("\\d+")).count();
    }
}