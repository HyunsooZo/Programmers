import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reporters = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        Set<String> check = new HashSet<>();
        int[] answer = new int[id_list.length];
        
        for(String id : id_list){
            reporters.put(id,new HashSet<>());
        }
        
        for(String repo : report){
            if(check.contains(repo)) continue;
            String[] temp = repo.split(" ");
            reporters.get(temp[0]).add(temp[1]);
            count.put(temp[1],count.getOrDefault(temp[1],0)+1);
            check.add(repo);
        }
        
        for(int i = 0 ; i < id_list.length ; i++){
            Set<String> set = reporters.get(id_list[i]);
            for(String name : set){
                if(count.get(name) >= k){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}