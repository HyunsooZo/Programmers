import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2]; 
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String s : keyinput) {
            move(answer, s, maxX, maxY);
        }

        return answer;
    }

    private void move(int[] position, String direction, int maxX, int maxY) {
        switch (direction) {
            case "right" -> {
                if (position[0] < maxX) position[0]++;
            }
            case "left" -> {
                if (position[0] > -maxX) position[0]--;
            }
            case "up" -> {
                if (position[1] < maxY) position[1]++;
            }
            case "down" -> {
                if (position[1] > -maxY) position[1]--;
            }
        }
    }
}
