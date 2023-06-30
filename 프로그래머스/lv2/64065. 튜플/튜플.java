import java.util.regex.Pattern;
import java.util.*;

class Tuple implements Comparable<Tuple>{
    String[] items;
    public Tuple(String[] items){
        this.items = items;
    }
    
    @Override
    public int compareTo(Tuple other){
        return this.items.length-other.items.length;
    }
}

class Solution {
    public int[] solution(String s) {
        String[] sArr = s.split(Pattern.quote("},{"));
        int len = sArr.length;
        List<Tuple> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>(); 
        int[] result = new int[len];
        int[] nums = new int[10];
        for(String str : sArr){
            list.add( 
                new Tuple(str.replace("{", "").replace("}", "").split(","))
                );
        }
        Collections.sort(list);
        
        int idx = 0;
        for(Tuple t : list){
            for(int i = 0 ; i < t.items.length ; i++){
                if(!answer.contains(Integer.parseInt(t.items[i]))){
                    answer.add(Integer.parseInt(t.items[i]));
                }
            }
        }
        for(int i = 0 ; i < list.size() ; i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}