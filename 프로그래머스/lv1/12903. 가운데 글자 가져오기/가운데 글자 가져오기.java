class Solution {
    public String solution(String s) {
        int len = s.length();
        int target = len/2;
        if(len%2==0){
            return s.substring(target-1,target+1);
        }else{
            return s.substring(target,target+1);
        }
    }
}