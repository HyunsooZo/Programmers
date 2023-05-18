import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int m = n;
        list.add(m);
        while(m>1){
            if(m%2==0) m/=2;
            else m=(3*m)+1;
            list.add(m);
        }
        int[] answer = new int[list.size()];
        int idx=0;
        for(int i : list) answer[idx++] = i;
        return answer;
    }
}