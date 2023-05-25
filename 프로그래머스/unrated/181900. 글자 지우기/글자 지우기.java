class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] temp = my_string.toCharArray();
        
        for(int i :indices){
            temp[i] = '+';
        }
        for(char c : temp){
            if(c=='+'){
               continue;
            }
             sb.append(c);
        }
        
        return sb.toString();
    }
}