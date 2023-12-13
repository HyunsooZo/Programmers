class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skillArr = skill.toCharArray();
        
        for(int i = 0 ; i < skill_trees.length ; i++){
            boolean check = true;
            int skillIdx= 0;
            char[] temp = skill_trees[i].toCharArray();
            for(int j = 0 ; j < temp.length ; j++){
                if(skillIdx<skillArr.length && temp[j]==skillArr[skillIdx]){
                    skillIdx++;
                    temp[j]=' ';
                }
            }
            for(int j = 0 ; j < temp.length ; j++){
                for(int k = 0 ; k < skillArr.length ; k++){
                    if(temp[j]==skillArr[k]){
                        check = false;
                    }      
                }
            }
            if(check){
                answer++;
            }
        }
        
        return answer;
    }
}