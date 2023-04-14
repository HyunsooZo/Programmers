class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] xArr = new int[10],yArr = new int[10];
        for(String x : X.split("")) xArr[Integer.parseInt(x)]++;
        for(String y : Y.split("")) yArr[Integer.parseInt(y)]++;
        for(int i = 9 ; i>=0 ;i--){
            while(xArr[i]>0 && yArr[i]>0){
                answer.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }
        if(answer.toString().equals("")) return "-1";
        return answer.toString().startsWith("0")?"0":answer.toString();
    }
}