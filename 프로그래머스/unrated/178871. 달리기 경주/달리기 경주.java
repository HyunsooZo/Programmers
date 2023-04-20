import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> call = new HashMap<>();
        for(int i = 0 ; i < players.length ; i++){
          call.put(players[i],i); 
        } 
        for(String s : callings) {
            int idx = call.get(s);
            swap(call,players, idx, idx-1);
        }
        return players;
    }
     public static void swap(HashMap<String,Integer> call,String[] players,int i ,int j){
        call.put(players[i],j);
        call.put(players[j],i);
        String temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }
}