import java.util.*;
class Process {
    int idx;
    int val;
    public Process(int idx, int val){
        this.idx = idx;
        this.val = val;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Process> q = new LinkedList<>();
        Queue<Integer> valQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < priorities.length; i++){
            q.offer(new Process(i,priorities[i]));
            valQ.offer(priorities[i]);
        }
        
        while(!q.isEmpty()&& !valQ.isEmpty()){
            Process cur = q.poll();
            int priority = valQ.peek();
            if(cur.val == priority){
                valQ.poll();
                answer++;       
                if(location==cur.idx){
                    return answer;
                }
            }else{
                q.offer(cur);
            }
        }
        return answer;
    }
}