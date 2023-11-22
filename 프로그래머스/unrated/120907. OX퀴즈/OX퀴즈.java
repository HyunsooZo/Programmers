class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0 ; i < quiz.length ;i++){
            String s = quiz[i];
            String[] temp = s.split(" ");
            int a = isMinus(temp[0])?
                Integer.parseInt(temp[0].replace("-",""))*-1:
                Integer.parseInt(temp[0]);
            String b = temp[1];
            int c = isMinus(temp[2])?
                Integer.parseInt(temp[2].replace("-",""))*-1:
                Integer.parseInt(temp[2]);
            String d = temp[3];
            int e = isMinus(temp[4])?
                Integer.parseInt(temp[4].replace("-",""))*-1:
                Integer.parseInt(temp[4]);
            if(b.equals("-")){
                answer[i] = a - c == e ? "O" : "X";
            }else if(b.equals("+")){
                answer[i] = a + c == e ? "O" : "X";
            }
        }
        
        
        return answer;
    }
    private boolean isMinus(String a){
        return a.contains("-");
    }
}