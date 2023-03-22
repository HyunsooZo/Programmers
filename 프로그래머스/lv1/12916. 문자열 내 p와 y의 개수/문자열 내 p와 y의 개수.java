class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int comp = s.charAt(i);
            if(comp == 'P'){
                pCnt++;
            }else if(comp == 'Y'){
                yCnt++;
            }
        }
        return pCnt==yCnt?true:false;
    }
}