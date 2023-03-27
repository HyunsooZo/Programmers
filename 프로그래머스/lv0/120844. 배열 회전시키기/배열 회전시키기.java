import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> a = new LinkedList<>();
        for(int i:numbers){
           a.offer(i);
        }
        if(direction.equals("right")){
            a.addFirst(a.removeLast());
        }else{
            a.addLast(a.poll());
        }
        int[] b = new int [numbers.length];
        for(int i = 0; i<numbers.length ; i++ ){
            b[i] = a.pop();
        }
        return b;
    }
}