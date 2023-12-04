import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
            if (this.gold == other.gold) {
                if (this.silver == other.silver) {
                    return other.bronze - this.bronze;
                } else {
                    return other.silver - this.silver;
                }
            } else {
                return other.gold - this.gold;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] len = br.readLine().split(" ");
        int n = Integer.parseInt(len[0]);
        int target = Integer.parseInt(len[1]);
        Country targetCountry = null;

        List<Country> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            Country country =
                    new Country(Integer.parseInt(temp[0]),
                            Integer.parseInt(temp[1]),
                            Integer.parseInt(temp[2]),
                            Integer.parseInt(temp[3]));
            list.add(country);
            if (temp[0].equals(String.valueOf(target))) {
                targetCountry = new Country(-1,
                        Integer.parseInt(temp[1]),
                        Integer.parseInt(temp[2]),
                        Integer.parseInt(temp[3]));

            }
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).gold == targetCountry.gold &&
                    list.get(i).silver == targetCountry.silver &&
                    list.get(i).bronze == targetCountry.bronze) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
