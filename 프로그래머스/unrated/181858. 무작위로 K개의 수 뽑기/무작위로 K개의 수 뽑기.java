import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0 ; i < k ; i++) answer[i] =-1;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int idx = 0 , i = 0;
        while(idx<k && i<arr.length){
            if(map.getOrDefault(arr[i],0)<1) answer[idx++] = arr[i];
            
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            i++;
        }
        return answer;
    }
}