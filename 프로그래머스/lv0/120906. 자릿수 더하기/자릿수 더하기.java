class Solution {
    public int solution(int n) {
        String n2 = String.valueOf(n);
        int answer = 0;
        for(int i = 0; i < n2.length() ; i++){
            answer += Character.getNumericValue(n2.charAt(i));
        }
        return answer;
    }
}