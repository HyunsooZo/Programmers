import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Double> a = new ArrayList<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            a.add(Math.ceil((score[i][0] + score[i][1]) /(double) 2));
        }
        Collections.sort(a,Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (Math.ceil((score[i][0] + score[i][1]) / (double)2) == a.get(j)) {
                    answer[i] = a.indexOf(a.get(j))+1;
                }
            }
        }
        return answer;
    }
}