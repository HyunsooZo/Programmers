import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int budget = 0;
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        String[] temp = br.readLine().split(" ");
        for (int j = 0; j < temp.length; j++) {
            arr[j] = Integer.parseInt(temp[j]);
        }
        budget = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        solve(arr, 0, arr[len-1]);
        System.out.println(answer);;

    }

    private static void solve(int[] arr, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Math.min(arr[i], mid);
            }
            if (sum <= budget) {
                answer = Math.max(mid,answer);
                left++;
            } else {
                right--;
            }
        }
    }
}
