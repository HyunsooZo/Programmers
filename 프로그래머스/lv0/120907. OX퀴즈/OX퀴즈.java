class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[2]);
            int z = Integer.parseInt(temp[4]);
            int result = 0;
            if (temp[1].charAt(0) == '+') {
                result = x + y;
            } else if (temp[1].charAt(0) == '-') {
                result = x - y;
            }
            answer[i] = result == z ? "O" : "X";
        }
        return answer;
    }
}



