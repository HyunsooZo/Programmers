import java.util.*;
class Solution {
    
    static boolean[][] visited;
    static int[][] map;
    static List<Integer> list = new ArrayList<>();
    
    public int[] solution(String[] maps) {
        visited = new boolean[maps.length][maps[0].length()];
        map = new int[maps.length][maps[0].length()];
        
        //지도 만들기 
        for(int i = 0 ; i < maps.length ; i++){
            String[] part = maps[i].split("");
            for(int j = 0 ; j < part.length ; j++){
                map[i][j] = part[j].equals("X")?-99:Integer.parseInt(part[j]);
            }
        }
        
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0 ; j < map[0].length ; j++){
                if(!visited[i][j]){
                    int island = checkAndSum(i,j);
                    if(island!=0){
                        list.add(island);
                    }
                }
            }
        }
        if(list.size()==0){
            return new int[]{-1};
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private static int checkAndSum(int x, int y) {
        if (x < 0 || y < 0 || 
            x >= map.length || 
            y >= map[0].length||
            map[x][y]==-99 || visited[x][y]) {
            return 0;
        }

        int current = map[x][y];
        visited[x][y] = true; 
        int sum = current;

        // 우측, 아래쪽으로 이동하여 유효한 범위의 합을 찾음
        sum += checkAndSum(x + 1, y);
        sum += checkAndSum(x - 1, y);
        sum += checkAndSum(x, y + 1);
        sum += checkAndSum(x, y - 1);

        return sum;
    }

}