import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i= 1 ; i<=3 ; i++) hm.put(i,0);
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i]==a[i%a.length]) hm.put(1,hm.get(1)+1);
            if(answers[i]==b[i%b.length]) hm.put(2,hm.get(2)+1);
            if(answers[i]==c[i%c.length]) hm.put(3,hm.get(3)+1);
        }
        int[] answer = {1,2,3};
        int max = 0;
        for(int i : hm.keySet()) if(hm.get(i)>max) max = hm.get(i);

        int finalMax = max;
        return Arrays.stream(answer).filter(x->hm.get(x)==finalMax).toArray();
    }
}