class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder answer = new StringBuilder();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < skip.length(); i++) {
            alphabet = alphabet.replace(
                Character.toString(skip.charAt(i)), "");
        }
        
        int idx = -1;
        
        for(int i = 0; i < s.length();i++) {
            idx = alphabet.indexOf(Character.toString(s.charAt(i)))+index;
            answer.append(alphabet.charAt(idx%alphabet.length()));
        }
        
        return answer.toString();
    }
}
