import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int x1 = 51, y1 = 51, x2 = -1 , y2 = -1;
        for(int i = 0 ; i < wallpaper.length ; i++){
            char[] arr = wallpaper[i].toCharArray();
            for(int j = 0 ; j < arr.length; j++){
                if(arr[j]=='#'){
                    x1 = Math.min(x1,i);
                    y1 = Math.min(y1,j);
                    x2 = Math.max(x2,i);
                    y2 = Math.max(y2,j);
                }   
            }
        }
        
        return new int[]{x1,y1,x2+1,y2+1};
    }
}