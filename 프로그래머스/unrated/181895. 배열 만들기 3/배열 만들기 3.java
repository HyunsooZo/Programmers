import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < intervals.length ; i++){
            for(int j = intervals[i][0] ; j <=intervals[i][1] ; j++){
                list.add(arr[j]);   
            }
        }
        int[] answer = new int[list.size()];
        int idx = 0;
        for(int i : list) answer[idx++] = i;
        return answer;
    }
}