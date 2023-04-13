import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashSet<String> set = new HashSet<>();
        String prev = words[0];
        set.add(prev);
        for(int i = 1 ; i < words.length ; i++){
            String s = words[i];
            if(set.contains(s) || s.charAt(0) != prev.charAt(prev.length()-1)){
                int seq = (i+1) % n == 0 ? n : (i+1) % n;
                int turn = (int)Math.ceil((double)(i+1) /(double)n);
                answer[0] = seq;
                answer[1] = turn;
                break;
            }
            set.add(s);
            prev = s;
        }
        return answer;
    }
}
