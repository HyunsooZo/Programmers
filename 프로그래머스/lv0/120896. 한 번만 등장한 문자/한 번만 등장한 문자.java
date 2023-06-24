class Solution {
    public String solution(String s) {
        int[] alphabet = new int[26];
        char[] sArr = s.toCharArray();
        int len1 = sArr.length , len2 = alphabet.length;
        for(char c: sArr) alphabet[c-'a']++;
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0 ; i< len2 ; i++){
            if(alphabet[i]==1){
                answer.append((char)(i+'a'));
            }
        }
        
        return answer.toString();
    }
}