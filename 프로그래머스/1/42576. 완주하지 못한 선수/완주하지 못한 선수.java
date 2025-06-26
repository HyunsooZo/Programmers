import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        var finalistMap = new HashMap<String,Integer>();
        
        for(var starter : participant){
            finalistMap.put(starter, finalistMap.getOrDefault(starter,0)+1);
        }
        
        for(var finalist : completion){
            finalistMap.put(finalist, finalistMap.get(finalist)-1);
        }
        
        for(var finalist : finalistMap.keySet()){
            if(finalistMap.get(finalist) > 0){
                return finalist;
            }
        }
        
        return "none";
    }
}