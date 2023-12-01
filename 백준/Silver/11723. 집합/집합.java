import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> set = new HashSet<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int len = Integer.parseInt(br.readLine());

        for (int i = 0; i < len; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String command = st.nextToken();

            if (command.equals("all")) {
                set = new HashSet<>();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (command.equals("empty")) {
                set.clear();
            } else {
                int num = Integer.parseInt(st.nextToken());
                solution(command, num);
            }
        }
        br.close();
        bw.close();
    }

    public static void solution(String input, int num) throws IOException {
        if (input.equals("add")) {
            set.add(num);
        } else if (input.equals("remove")) {
            set.remove(num);
        } else if (input.equals("check")) {
            if (set.contains(num)) {
                bw.write(1 + "\n");
            } else {
                bw.write(0 + "\n");
            }
        } else if (input.equals("toggle")) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
    }
}
