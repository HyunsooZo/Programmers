import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String firstWord = br.readLine();
        int[] arr = new int[26];
        int answer = 0;

        // 배열에 각 알파벳 갯수 저장
        for (int i = 0; i < firstWord.length(); i++) {
            arr[firstWord.charAt(i) - 'A']++;
        }

        // 배열에서 각 알파벳의 갯수를 조정하고, 조건에 따라 answer 증가
        for (int i = 0; i < n - 1; i++) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            String word = br.readLine();

            if (Math.abs(word.length() - firstWord.length()) <= 1) {
                for (int j = 0; j < word.length(); j++) {
                    temp[word.charAt(j) - 'A']--;
                }

                int countNotZero = 0;
                int countOver = 0;
                int countOne = 0;
                int countMinusOne = 0;

                for (int value : temp) {
                    if (value != 0) countNotZero++;
                    if (value < -1 || value > 1) countOver++;
                    if (value == 1) countOne++;
                    if (value == -1) countMinusOne++;
                }

                if (countNotZero == 0) answer++;
                else if (countOver == 0 && countOne <= 1 && countMinusOne <= 1) {
                    answer++;
                }
            }
        }

        bw.write(answer+ "");

        bw.flush();
    }
}
