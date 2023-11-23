class Solution {
    public int[] solution(String[] wallpaper) {
        int L = wallpaper.length;
        int LL = wallpaper[0].length();
        int xMax = -1;
        int yMax = -1;
        int xMin = 51;
        int yMin = 51;
        for(int i = 0 ; i < L ; i++){
            for(int j = 0 ; j < LL ; j++){
                if(wallpaper[i].charAt(j)=='#'){
                    xMax = Math.max(xMax,i);
                    yMax = Math.max(yMax,j);
                    xMin = Math.min(xMin,i);
                    yMin = Math.min(yMin,j);
                }
            }
        }
        return new int[]{xMin,yMin,xMax+1,yMax+1};
    }
}