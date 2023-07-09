import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int len = skill_trees.length;
        int lenSkill = skill.length();
        char[] skills = skill.toCharArray();     
        
        for (int i = 0; i < len; i++) {
            int count = 0;
            char[] skillTrees = skill_trees[i].toCharArray();
            Deque<Character> q1 = new LinkedList<>();  
                        
            for (char c : skills) {
                q1.add(c);
                if(skill_trees[i].contains(String.valueOf(c))){
                    count++;
                }
            }
            for(char c : skillTrees){
                if(q1.isEmpty()){
                    break;
                }
                if(c==q1.peek()){
                    q1.poll();
                }    
            }
                                    
            if (q1.size() == lenSkill-count ) {
                answer++;
            }
        }
        return answer;
    }
}
