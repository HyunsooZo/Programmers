class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] E = {0, 1}, N = {-1, 0}, W = {0, -1}, S = {1, 0}, start = {0, 0};
        int first = park.length;
        int second = park[0].length();
        for (int i = 0; i < first; i++) {
            if (park[i].contains("S")) {
                start[0] = i;
                start[1] = park[i].indexOf("S");
                break;
            }
        }
        System.out.println(start[0]+" "+start[1]);

        for (String s : routes) {
            if (s.startsWith("S")) move(s, S, start, park, first, second);
            else if (s.startsWith("N")) move(s, N, start, park, first, second);
            else if (s.startsWith("W")) move(s, W, start, park, first, second);
            else if (s.startsWith("E")) move(s, E, start, park, first, second);
        }
        
        return start;
    }

    private void move(String str, int[] alphabet, int[] start, String[] park, int first, int second) {
        char c = str.charAt(0);
        int cnt =0;
        int times = Character.getNumericValue(str.charAt(2));
        int nextX = start[0];
        int nextY = start[1];
        for (int j = 0; j < times; j++) {
            nextX += alphabet[0];
            nextY += alphabet[1];
            if (nextX >= 0 && nextX < first &&
                    nextY >= 0 && nextY < second &&
                    park[nextX].charAt(nextY) != 'X') {
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == times) {
                for(int i = 0 ; i < times ; i++){
                    start[0] += alphabet[0];
                    start[1] += alphabet[1];
                }
            }
        }
    }
}
