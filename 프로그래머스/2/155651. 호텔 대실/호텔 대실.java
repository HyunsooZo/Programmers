import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        List<int[]> bookTimeInt = new ArrayList<>();

        for (String[] time : book_time) {
            int start = 
                Integer.parseInt(time[0].substring(0, 2)) * 60 + 
                Integer.parseInt(time[0].substring(3));
            int end = 
                Integer.parseInt(time[1].substring(0, 2)) * 60 + 
                Integer.parseInt(time[1].substring(3)) + 10;
            
            bookTimeInt.add(new int[]{start, 1});
            bookTimeInt.add(new int[]{end, 0});
        }
        
        Collections.sort(bookTimeInt, Comparator.comparingInt((int[] o) -> o[0])
              .thenComparingInt(o -> o[1]));


        int room = 0;
        for (int[] time : bookTimeInt) {
            if (time[1] == 1) {
                room++;
            } else {
                room--;
            }
            answer = Math.max(room,answer);
            // System.out.print(time[0] + "/" + time[1] + "\n");
        }

        return answer;
    }
}
