import java.util.*;
class Solution {
    static String[][] keypad = new String[][]{
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"},
            {"*","0","#"}
        };
    static Map<String,int[]> cur = new HashMap<>();
    static Map<String,int[]> nums = new HashMap<>();
    static boolean leftHanded;
    
    public String solution(int[] numbers, String hand) {
        
        leftHanded = hand.equals("left");

        cur.put("L",new int[]{3,0});
        cur.put("R",new int[]{3,2});
        
        nums.put("1",new int[]{0,0});
        nums.put("2",new int[]{0,1});
        nums.put("3",new int[]{0,2});
        nums.put("4",new int[]{1,0});
        nums.put("5",new int[]{1,1});
        nums.put("6",new int[]{1,2});
        nums.put("7",new int[]{2,0});
        nums.put("8",new int[]{2,1});
        nums.put("9",new int[]{2,2});
        nums.put("*",new int[]{3,0});
        nums.put("0",new int[]{3,1});
        nums.put("#",new int[]{3,2});
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < numbers.length ; i++){
            String target = String.valueOf(numbers[i]);
            if(target.equals("1") || 
               target.equals("4") || 
               target.equals("7")){
                
                sb.append("L");
                cur.put("L",nums.get(target));

            }else if(target.equals("3")|| 
                     target.equals("6") || 
                     target.equals("9")){
            
                sb.append("R");
                cur.put("R",nums.get(target));
                
            }else{
                String nextHand = distance("L","R",target);
                cur.put(nextHand,nums.get(target));
                sb.append(nextHand);
            }
        }
        
        return sb.toString();
    }
    
    private static String distance(String left, 
                                   String right, 
                                   String target){
        
        int[] aArr = cur.get(left);
        int[] bArr = cur.get(right);
        int[] targetArr = nums.get(target);
        
        int temp1 = 
            Math.abs(targetArr[0]-aArr[0]) + 
            Math.abs(targetArr[1]-aArr[1]);
        
        int temp2 = 
            Math.abs(targetArr[0]-bArr[0]) + 
            Math.abs(targetArr[1]-bArr[1]);
        
        if(temp1 == temp2){
            return leftHanded ? "L" : "R";
        }
        return temp1 > temp2 ? "R" : "L";
    }
}