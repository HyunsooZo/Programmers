class Solution {
    public String solution(String s) {
        char[] temp = s.toCharArray();
        temp[0] = Character.toUpperCase(temp[0]);
        for(int i = 1 ; i < temp.length ; i++){
        temp[i] = temp[i-1]==' '? 
            Character.toUpperCase(temp[i]):
            Character.toLowerCase(temp[i]);
        }
        return String.valueOf(temp);
    }
}