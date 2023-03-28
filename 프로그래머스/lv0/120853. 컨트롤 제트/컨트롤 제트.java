import java.util.*;
class Solution {
    public int solution(String s) {
        ArrayList<String> al = new ArrayList(Arrays.asList(s.split(" ")));
        int answer = 0;
        for(int i = 0 ; i < al.size() ; i++){
            if(al.get(i).equals("Z")){
                answer -= Integer.parseInt(al.get(i-1));
            }else{
            answer += Integer.parseInt(al.get(i));
            }
        }
        return answer;
    }
}