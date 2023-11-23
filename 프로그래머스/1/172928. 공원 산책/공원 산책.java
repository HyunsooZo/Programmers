class Solution {
    //좌 우 상 하
    int[] dirX = {0, 0, -1 , 1};
    int[] dirY = {-1, 1 , 0, 0};
    String[][] map;
    int[] cur = new int[2];
    public int[] solution(String[] park, String[] routes) {
        map = new String[park.length][park[0].length()];
        
        for(int i = 0 ; i < park.length ; i++){
            if(park[i].contains("S")){
                cur = new int[]{i,park[i].indexOf("S")};
            }
            map[i] = park[i].split("");    
        }
        
        for(int i = 0 ; i < routes.length; i++){
            
            String[] cmd = routes[i].split(" ");
            
            int newX = cur[0];
            int newY = cur[1];
            int len = Integer.parseInt(cmd[1]);
            for(int j = 0 ; j < len ; j++){
                if(cmd[0].equals("N")){
                    newX += dirX[2];
                    newY += dirY[2];
                }else if(cmd[0].equals("S")){
                    newX += dirX[3];
                    newY += dirY[3];
                }else if(cmd[0].equals("W")){
                    newX += dirX[0];
                    newY += dirY[0];
                }else if(cmd[0].equals("E")){
                    newX += dirX[1];
                    newY += dirY[1];
                }
                if(newX>=map.length || newX < 0||
                   newY >= map[0].length || newY <0||
                   map[newX][newY].equals("X")){
                    newX = cur[0];
                    newY = cur[1];
                    break;
                }
            }
            cur[0] = newX;
            cur[1] = newY;          
        }
        
        return cur;
    }
}