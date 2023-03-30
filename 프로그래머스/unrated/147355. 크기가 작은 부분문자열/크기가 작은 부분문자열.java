import java.util.*;

class Solution {
    public int solution(String t, String p) {
        if(t.length()==p.length()){
            return 1;
        }
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            a.add(t.substring(i, i + p.length()));
        }
        long[] b = a.stream().mapToLong(Long::parseLong).toArray();
        return Arrays.stream(b).filter(x->x<=Long.parseLong(p)).toArray().length;
    }
}
