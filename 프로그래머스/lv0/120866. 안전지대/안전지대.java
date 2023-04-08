import java.util.*;

class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if ((int) Arrays.stream(board[i]).filter(x -> x == 0).count() == 0) {
                return 0;
            }
        }
        if (board.length == 1) return board[0][0]==1?0:1;
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (j == 0) {
                        board[i][j + 1] = board[i][j + 1] == 1 ? 1 : 2;
                        if (i == 0) {
                            board[i + 1][j + 1] = board[i + 1][j + 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                        } else if (i == board.length - 1) {
                            board[i - 1][j + 1] = board[i - 1][j + 1] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        } else {
                            board[i + 1][j + 1] = board[i + 1][j + 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                            board[i - 1][j + 1] = board[i - 1][j + 1] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        }
                    }
                    if (j == board[i].length - 1) {
                        board[i][j - 1] = board[i][j - 1] == 1 ? 1 : 2;
                        if (i == 0) {
                            board[i + 1][j - 1] = board[i + 1][j - 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                        } else if (i == board.length - 1) {
                            board[i - 1][j - 1] = board[i - 1][j - 1] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        } else {
                            board[i + 1][j - 1] = board[i + 1][j - 1] == 1 ? 1 : 2;
                            board[i - 1][j - 1] = board[i - 1][j - 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        }
                    }
                    if (j > 0 && j < board[i].length - 1) {
                        board[i][j - 1] = board[i][j - 1] == 1 ? 1 : 2;
                        board[i][j + 1] = board[i][j + 1] == 1 ? 1 : 2;
                        if (i == 0) {
                            board[i + 1][j - 1] = board[i + 1][j - 1] == 1 ? 1 : 2;
                            board[i + 1][j + 1] = board[i + 1][j + 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                        } else if (i == board.length - 1) {
                            board[i - 1][j - 1] = board[i - 1][j - 1] == 1 ? 1 : 2;
                            board[i - 1][j + 1] = board[i - 1][j + 1] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        } else {
                            board[i + 1][j - 1] = board[i + 1][j - 1] == 1 ? 1 : 2;
                            board[i - 1][j - 1] = board[i - 1][j - 1] == 1 ? 1 : 2;
                            board[i + 1][j + 1] = board[i + 1][j + 1] == 1 ? 1 : 2;
                            board[i - 1][j + 1] = board[i - 1][j + 1] == 1 ? 1 : 2;
                            board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                            board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                        }
                    }
                }
            }
        }
        for (int[] i : board) {
            System.out.println(Arrays.toString(i));
        }
        for (int i = 0; i < board.length; i++) {
            answer += (int) Arrays.stream(board[i]).filter(x -> x == 0).count();
        }
        return answer;
    }
}
                    