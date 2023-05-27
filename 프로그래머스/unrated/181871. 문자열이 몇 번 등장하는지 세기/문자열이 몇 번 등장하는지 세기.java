class Solution {
    public int solution(String myString, String pat) {
        int patLen = pat.length() , cnt = 0;
        for(int i = 0 ; i < myString.length()-patLen+1 ; i++){
            if(myString.substring(i,i+patLen).equals(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}