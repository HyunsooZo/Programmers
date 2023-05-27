import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length,i=0, idx = 0;
        while(i<len){
                if(list.size()==0){ 
                    list.add(arr[i++]);
                }else if(list.get(list.size()-1)<arr[i]){
                    list.add(arr[i++]);
                }else if(list.get(list.size()-1)>=arr[i]){
                    list.remove(list.size()-1);
            }
        }
        int[] stk = new int[list.size()];
        for(int it: list) stk[idx++] = it;
        return stk;
    }
}