import java.util.*;

class Node {
    int[] val;
    int count;

    Node(int[] val, int count) {
        this.val = val;
        this.count = count;
    }
}

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    boolean[][] visited;
    char[][] wholeBoard;

    public int solution(String[] board) {
        int rowLen = board.length;
        int colLen = board[0].length();
        Node rLoc = null, gLoc = null;
        visited = new boolean[rowLen][colLen];
        wholeBoard = new char[rowLen][colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                char[] temp = board[i].toCharArray();
                if (temp[j] == 'R') {
                    rLoc = new Node(new int[]{i, j}, 0);
                }
                if (temp[j] == 'G') {
                    gLoc = new Node(new int[]{i, j}, 0);
                }
                wholeBoard[i][j] = temp[j];
            }
        }
        return helper(rLoc, gLoc);
    }

    public int helper(Node rLoc, Node gLoc) {
        Deque<Node> q = new LinkedList<>();
        visited[rLoc.val[0]][rLoc.val[1]] = true;
        q.offer(rLoc);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            int x = cur.val[0], y = cur.val[1], count = cur.count;

            if (x == gLoc.val[0] && y == gLoc.val[1]) {
                return count;
            }

            for (int i = 0; i < dx.length; i++) {
                int newX = x;
                int newY = y;
                while (newX + dx[i] >= 0 && 
                       newX + dx[i] < wholeBoard.length && 
                       newY + dy[i] >= 0 && 
                       newY + dy[i] < wholeBoard[0].length && 
                       wholeBoard[newX + dx[i]][newY + dy[i]] != 'D') {
                    newX += dx[i];
                    newY += dy[i];
                }
                Node newNode = new Node(new int[]{newX, newY}, count + 1);
                if (!visited[newNode.val[0]][newNode.val[1]]) {
                    visited[newNode.val[0]][newNode.val[1]] = true;
                    q.offer(newNode);
                }
            }
        }
        return -1;
    }
}
