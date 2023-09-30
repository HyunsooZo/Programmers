import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            boolean isMinus = false; 
            if(quiz[i].charAt(0)=='-'){
                isMinus = true;
                quiz[i] = quiz[i].substring(1);
            }
            String[] temp = quiz[i].split(" ");
            int left1 = Integer.parseInt(temp[0]);
            int left2 = Integer.parseInt(temp[2]);
            int right = Integer.parseInt(temp[4]);
            int cal = 0;
            if(isMinus) {
                left1 *= -1;
            }
            if (temp[1].charAt(0) == '+') {
                cal = left1 + left2;
            } else if (temp[1].charAt(0) == '-') {
                cal = left1 - left2;
            }
            answer[i] = cal == right ? "O" : "X";
        }  
        return answer;
    }
}



