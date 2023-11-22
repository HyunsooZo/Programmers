class Solution {
    public int[] solution(String myString) {
        int len = 1;
        String[] temp = myString.split("");
        for(String s : temp){
            if(s.equals("x")){
                len++;
            }
        }
        int[] answer = new int[len];
        int idx = 0;
        for(String s : temp){
            if(!s.equals("x")){
                answer[idx]++;
            }else{
                idx++;
            }
        }
        
        return answer;
    }
}