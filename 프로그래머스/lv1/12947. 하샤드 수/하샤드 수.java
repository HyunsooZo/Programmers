class Solution {
    public boolean solution(int x) {
        String x2 = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < x2.length() ; i++){
            sum += Character.getNumericValue(x2.charAt(i));
        }
        return x%sum==0?true:false;
    }
}