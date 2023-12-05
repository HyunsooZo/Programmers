
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();
        int[] answer = new int[len];

        for ( int i = 0 ; i < len ; i++){
            String[] str = br.readLine().split(" ");
            int[] temp = new int[] { Integer.parseInt(str[0]), Integer.parseInt(str[1]) };
            list.add(temp);
        }

        for(int i = 0 ; i < len ; i++){
            int weight = list.get(i)[0];
            int height = list.get(i)[1];
            for( int j = 0 ; j < len ; j++){
                if(list.get(j)[0] > weight && list.get(j)[1] > height){
                    answer[i]++;
                }

            }
        }
        for(int i : answer){
            bw.write(i+1 + " ");
        }
        bw.flush();
    }
}
