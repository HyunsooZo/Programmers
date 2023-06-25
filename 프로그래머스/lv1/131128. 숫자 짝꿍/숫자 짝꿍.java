class Solution {
    public String solution(String X, String Y) {
        int[] xInt = new int[10] ,yInt = new int[10];
        
        for (char c : X.toCharArray()) xInt[c - '0']++;
        for (char c : Y.toCharArray()) yInt[c - '0']++;
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 9; i >= 0; i--) {
            int cnt = Math.min(xInt[i], yInt[i]);
            for (int j = 0; j < cnt; j++) {
                answer.append(i);
            }
        }
        
        if (answer.length() == 0) return "-1";
        
        if (answer.charAt(0) == '0') {
            return answer.toString().replaceAll("[0]+","0");
        }
        
        return answer.toString();
    }
}
