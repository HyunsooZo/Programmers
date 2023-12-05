import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int len = Integer.parseInt(input[0]);
        int cnt = 1 ;
        if(input[1].equals("Y")){
            cnt = 1;
        }else if(input[1].equals("F")){
            cnt = 2;
        }else if(input[1].equals("O")){
            cnt = 3;
        }
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < len ; i++){
            set.add(br.readLine());
        }

        System.out.println((set.size())/cnt);

    }
}