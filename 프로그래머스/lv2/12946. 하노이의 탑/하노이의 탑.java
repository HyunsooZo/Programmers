import java.util.*;
class Solution {
    private static ArrayList<int[]> list = new ArrayList<>();
    
    public void hanoi(int n , int start , int end , int middle){
        if(n==1){
            list.add(new int[]{start,end});
            return;
        }
        hanoi(n-1,start,middle,end);
        
        list.add(new int[]{start,end});
        
        hanoi(n-1,middle,end,start);
        }
    
    public int[][] solution(int n) {
        
        hanoi(n,1,3,2);
        
        int[][] answer = new int[list.size()][];
        for(int i = 0 ; i < list.size() ; i++){
            answer[i]= list.get(i);
        }
        return answer;
    }
}
