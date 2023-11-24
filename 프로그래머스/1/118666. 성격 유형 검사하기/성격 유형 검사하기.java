import java.util.*;
class Solution {
    static Map<Character,Integer> map = new HashMap<>();
    static StringBuilder answer = new StringBuilder();         
    
    public String solution(String[] survey, int[] choices) {
        
                
        for(int i = 0 ; i < survey.length ; i++){
            
            char[] arr = survey[i].toCharArray();
            int val1 = map.getOrDefault(arr[0],0);
            int val2 = map.getOrDefault(arr[1],0);            
            
            if(choices[i]==1){
                map.put(arr[0],val1+3);
                map.put(arr[1],val2);
            }else if(choices[i]==2){
                map.put(arr[0],val1+2);
                map.put(arr[1],val2);
            }else if(choices[i]==3){
                map.put(arr[0],val1+1);
                map.put(arr[1],val2);
            }else if(choices[i]==4){
                map.put(arr[0],val1);
                map.put(arr[1],val2);
            }else if(choices[i]==5){
                map.put(arr[0],val1);
                map.put(arr[1],val2+1);
            }else if(choices[i]==6){
                map.put(arr[0],val1);
                map.put(arr[1],val2+2);
            }else if(choices[i]==7){
                map.put(arr[0],val1);
                map.put(arr[1],val2+3);
            }
        }
        appendString('R','T');
        appendString('C','F');
        appendString('J','M');
        appendString('A','N');
        
        return answer.toString();
    
    }
    private static void appendString(char a, char b){
        if(map.get(a)==map.get(b)){
            answer.append(a>b?b:a);
        }else{
            if(map.get(a)>map.get(b)){
                answer.append(a);
            }else{
                answer.append(b);
            }
        }
    }
}