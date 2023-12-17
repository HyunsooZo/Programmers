import java.util.*;

class Solution {    
    static class Task {
        int index;
        int start;
        int playTime;
        
        public Task(int index, int start, int playTime) {
            this.index = index;
            this.start = start;
            this.playTime = playTime;
        }
    }
    
    public String[] solution(String[][] plans) {
        String[] result = new String[plans.length];
        int idx = 0;
        
        Task[] tasks = new Task[plans.length];
        
        for (int i = 0; i < plans.length; i++) {
            String[] time = plans[i][1].split(":");
            int startTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            tasks[i] = new Task(i, startTime, Integer.parseInt(plans[i][2]));
        }
        
        Arrays.sort(tasks, Comparator.comparingInt(task -> task.start));
        
        Stack<Task> pending = new Stack<>();
        
        for (int i = 0; i < tasks.length - 1; i++) {
            int currentEnd = tasks[i].start + tasks[i].playTime;
            int nextStart = tasks[i + 1].start;
            
            if (currentEnd <= nextStart) {
                result[idx++] = (plans[tasks[i].index][0]);
                
                int remainingTime = nextStart - currentEnd;
                while (remainingTime > 0 && !pending.isEmpty()) {
                    int remainingPending = pending.peek().playTime - remainingTime;
                    pending.peek().playTime = Math.max(0, remainingPending);
                    
                    if (remainingPending <= 0) {
                        remainingTime = -1 * remainingPending;
                        result[idx++] = (plans[pending.pop().index][0]);
                    } else {
                        remainingTime = 0;
                    }
                }
            } else {
                tasks[i].playTime = (currentEnd - nextStart);
                pending.push(tasks[i]);
            }
        }
        
        result[idx++] = (plans[tasks[tasks.length - 1].index][0]);
        
        while (!pending.isEmpty()) {
           result[idx++] = plans[pending.pop().index][0];
        }
        
        return result;
    }
}
