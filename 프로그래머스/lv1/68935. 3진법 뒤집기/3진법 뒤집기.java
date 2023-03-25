
class Solution {
    public int solution(int n) {
        String temp = "";
        while(n>0){
            temp = n%3 + temp;
            n/=3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(temp));
        sb.reverse();
        return Integer.parseInt(sb.toString(),3);
    }
}