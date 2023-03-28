class Solution {
    public int solution(String my_string) {
        String[] temp = my_string.split(" ");
        int answer= Integer.parseInt(temp[0]);
        for(int i = 0 ; i < temp.length ;i++ ){
            if(temp[i].equals("+")){
                answer+= Integer.parseInt(temp[i+1]);
            }else if(temp[i].equals("-")){
                answer-= Integer.parseInt(temp[i+1]);
            }
        }
        return answer;
    }
}