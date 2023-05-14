import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i<finished.length ;i++){
            if(!finished[i]) list.add(todo_list[i]);
        }
        int idx = 0;
        String[] answer = new String[list.size()];
        for(String s : list){
            answer[idx++] = s; 
        }
        return answer;
    }
}