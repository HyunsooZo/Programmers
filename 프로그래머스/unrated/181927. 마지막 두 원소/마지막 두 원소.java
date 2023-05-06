class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int idx = 0;
        for(int i : num_list){
            answer[idx++] = i;
        }
        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            answer[answer.length-1] = num_list[num_list.length-1] -num_list[num_list.length-2]; 
        }else{
            answer[answer.length-1] = num_list[num_list.length-1]*2;
        }
        return answer;
    }
}