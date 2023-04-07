import java.util.*;
class Solution {
    public int solution(int n) {
        int multiple3Cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i<=100 ; i++) {
            if(i%3==0||String.valueOf(i).contains("3")){
              multiple3Cnt++;  
            } 
        }
        int i = 1;
        while(list.size()<=100) {
            if(i%3!=0&&!String.valueOf(i).contains("3")){
              list.add(i);  
            } 
            i++;
        }
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(multiple3Cnt);
        return list.get(n-1);
    }
}