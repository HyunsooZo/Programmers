import java.util.*;
class Solution {
    public String solution(String phone_number) {
        char[] astar = phone_number.toCharArray(); 
        for(int i = 0; i<phone_number.length()-4;i++){
            astar[i] = '*';
        }
        return Arrays.toString(astar).replaceAll("[\\[\\]\\,\\s]","");
    }
}