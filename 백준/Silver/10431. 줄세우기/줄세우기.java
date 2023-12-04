import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());

        for (int i = 0; i < len; i++) {
            String[] split = br.readLine().split(" ");
            int[] heights = new int[split.length - 1];
            for (int j = 1; j < split.length; j++) {
                heights[j - 1] = Integer.parseInt(split[j]);
            }
            int result = solve(heights);
            bw.write((i + 1) + " " + result + "\n");
        }
        bw.flush();
    }

    private static int solve(int[] heights) {
        int len = heights.length;
        int cnt = 0;
        for (int i = 0; i < len - 1; i++) {
            int target = heights[i];
            for (int j = i + 1; j < len; j++) {
                if (target > heights[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
