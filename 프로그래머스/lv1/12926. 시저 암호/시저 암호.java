class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            char temp = '0';
            if (Character.isAlphabetic(c)){
                 temp = (char)((int)c+n);
                if(Character.isUpperCase(c)){
                    if(temp>'Z'){
                        answer+= (char)(c+n-26);
                    }else{
                        answer+=temp;
                    }
                }else{
                    if(temp>'z'){
                        answer+= (char)(c+n-26);
                    }else{
                        answer+= temp;
                    }
                }
            }else {
                answer += c;
            }
        }
      
        return answer;
    }
}