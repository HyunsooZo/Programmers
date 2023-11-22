import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        for(int i = 0 ; i < delete_list.length ; i++){
            for(int j = 0 ;  j < arr.length ; j++){
                if(delete_list[i]==arr[j]){
                    arr[j]=0;
                    break;
                }
            }
        }
        return Arrays.stream(arr).filter(num -> num != 0).toArray();
    }
}