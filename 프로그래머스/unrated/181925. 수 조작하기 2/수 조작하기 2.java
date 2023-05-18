class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int num = numLog[0];
        for(int i =1 ; i < numLog.length ; i++){
            if(num+1==numLog[i]) answer.append("w");
            else if(num-1==numLog[i]) answer.append("s");
            else if(num+10==numLog[i]) answer.append("d");
            else if(num-10==numLog[i]) answer.append("a");
            num= numLog[i];
        }
        return answer.toString();
    }
}