import java.util.*;
class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int y = 0;
        String[] temp = polynomial.replace(" + "," ").split(" ");        
        for(int i = 0 ; i<temp.length ; i++){
            if(temp[i].contains("x")){
                if(temp[i].equals("x")){
                    x+=1;
                }else{
                x += Integer.parseInt(temp[i].replace("x",""));
                }
            }else{
                y += Integer.parseInt(temp[i]);
            }
        }        
        if(y==0){
            if(x==1){
            return "x";    
            }else{
            return String.valueOf(x)+"x";
            }
        }else if(x==0){
            return String.valueOf(y);
        }else if(x==1){
            return "x + "+String.valueOf(y);
        }else{
            return String.valueOf(x)+"x + "+String.valueOf(y);
        }
    }
}