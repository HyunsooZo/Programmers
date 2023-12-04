import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static class Country implements Comparable<Country> {
        int name;
        int gold;
        int silver;
        int bronze;

        public Country(int name, int gold, int silver, int bronze) {
            this.name = name;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Country other) {
            if (this.gold == other.gold && this.silver != other.silver) {
                return this.silver - other.silver;
            } else if (this.gold == other.gold &&
                    this.silver == other.silver &&
                    this.bronze != other.bronze) {
                return this.bronze - other.bronze;
            } else if (this.gold == other.gold &&
                    this.silver == other.silver &&
                    this.bronze == other.bronze) {
                return 0;
            } else {
                return this.gold - other.gold;

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] len = br.readLine().split(" ");
        int n = Integer.parseInt(len[0]);
        int target = Integer.parseInt(len[1]);

        List<Country> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            Country country =
                    new Country(Integer.parseInt(temp[0]),
                            Integer.parseInt(temp[1]),
                            Integer.parseInt(temp[2]),
                            Integer.parseInt(temp[3]));
            list.add(country);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name == target) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).compareTo(list.get(i)) == 0) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
        }
    }
}
