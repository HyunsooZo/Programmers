class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean isMinus = false;
        if(!Character.isDigit(s.charAt(0))){
            if(s.charAt(0)=='-'){
                isMinus = true;
            }
            sb.deleteCharAt(0);
        }
        return isMinus==true?Integer.parseInt(sb.toString())*-1:Integer.parseInt(sb.toString()) ;
    }
}