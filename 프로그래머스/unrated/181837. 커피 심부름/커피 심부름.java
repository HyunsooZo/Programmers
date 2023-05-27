class Solution {
    public int solution(String[] order) {
        int ame = 4500 , lat= 5000, answer = 0;
        for(String s : order){
            if(s.contains("lat"))answer+=lat; 
            else answer+=ame;
        }
        return answer;
    }
}