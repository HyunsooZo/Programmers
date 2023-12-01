import java.io.*;

/*
돌 게임은 두 명이서 즐기는 재밌는 게임이다.

탁자 위에 돌 N개가 있다. 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 돌은 1개 또는 3개 가져갈 수 있다.
마지막 돌을 가져가는 사람이 게임을 이기게 된다.

두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 게임은 상근이가 먼저 시작한다.

입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 1000)

출력
상근이가 게임을 이기면 SK를, 창영이가 게임을 이기면 CY을 출력한다.

예제 입력 1
5
예제 출력 1
SK
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int stone = Integer.parseInt(br.readLine());

        // 어차피 다 0(창영)으로 채워져 있음
        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        for (int i = 4; i <= stone; i++) {
            //만약 이전에 상근이가 1개 또는 3개를 가져갔다면 창영이는 1개 또는 3개를 가져가면 됨
            if (dp[i - 1] == 0 || dp[i - 3] == 0) {
                dp[i] = 1;
            }
        }

        //stone번째 가져간사람이 상경인지 창영인지
        bw.write(dp[stone] == 1 ? "SK" : "CY");
        bw.flush();
    }
}