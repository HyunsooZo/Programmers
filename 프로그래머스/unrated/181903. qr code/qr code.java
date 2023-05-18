class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for(char c : code.toCharArray()){
            if(a++%q==r) sb.append(c);
        }
        return sb.toString();
    }
}