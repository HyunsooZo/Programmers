import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        boolean left = false, right =false , neutral = true; 
        for(String s : str_list){
            if(neutral){
                if(s.equals("l")){
                    left = true;
                    neutral = false;
                    break;
                }else if(s.equals("r")){
                    right = true;
                    neutral = false;
                }else{
                    list1.add(s);
                }
            }else if(right){
                list2.add(s);
            }
        }
        if(left)return list1.toArray(new String[list1.size()]);
        if(right)return list2.toArray(new String[list2.size()]);
        return new String[]{};
    }
}