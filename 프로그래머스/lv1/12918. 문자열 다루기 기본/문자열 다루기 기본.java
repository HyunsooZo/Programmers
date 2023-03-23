class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] s2 = s.toCharArray();
        if(s.length()==4||s.length()==6){
            for(char a : s2){
                if(Character.isAlphabetic(a)){
                    answer = false;
                }
             }
        }else{
            answer= false;
        }
        return answer;
    }
}