import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = IntStream.range(0, name.length)
                .boxed()
                .collect(Collectors.toMap(i -> name[i], i -> yearning[i]));

        return Arrays.stream(photo)
                .mapToInt(people -> Arrays.stream(people)
                        .filter(map::containsKey)
                        .mapToInt(map::get)
                        .sum())
                .toArray();
    }
}
