import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < players.length; i++){
            map.put(players[i],i);
        }
        
        for(String s : callings){
            swap(players,map , map.get(s));
        }
        return players;
    }
    public void swap(String[] players ,Map<String,Integer> map, int idx){
        map.put(players[idx] , idx-1);
        map.put(players[idx-1] , idx);
        String temp = players[idx-1];
        players[idx-1] = players[idx];
        players[idx] = temp;
        
    }
}