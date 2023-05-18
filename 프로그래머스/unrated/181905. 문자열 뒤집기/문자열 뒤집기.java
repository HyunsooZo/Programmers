class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        StringBuilder sb = 
            new StringBuilder(my_string.substring(s,e+1));
        sb.reverse();
        for(int i = e+1 ; i<my_string.length(); i++){
            sb.append(my_string.charAt(i));
        }
        return answer+sb.toString();
    }
}