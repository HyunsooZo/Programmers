import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : section) list.add(i);
        
        int[] temp = new int[n];
        
        int j = 0;
        for(int i = 1 ; i <= n ; i++){
            if(list.contains(i)){
                temp[j] = 0;    
            }else{
                temp[j] = 1;    
            }
            System.out.print(temp[j]+" ");
            j++;
        }
        
        int i = 0;
        
        while(i<temp.length){
            if(temp[i]==0){
                answer++;
                i+=m-1;
            }
            i++;
        }
        return answer;
    }
}
