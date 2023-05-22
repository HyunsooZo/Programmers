import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for(int i = l ; i <=r ; i++){
            if(check(i)) answer.add(i);
        }
        if(answer.size()==0) return new int[] {-1};
        int[] answer2 = new int[answer.size()];
        int idx = 0;
        for(int i=0 ; i<answer.size() ; i++) answer2[i] = answer.get(i);
        return answer2;
    }
    public boolean check(int num){
        while(num>=1){
            if(num%10!=0 &&num%10!=5 ) return false;
            num/=10;
        }
        return true;
    }
}