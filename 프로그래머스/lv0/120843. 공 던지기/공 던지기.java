import java.util.*;
class Solution {
    public int solution(int[] numbers, int k) {
        Deque<Integer> a = new LinkedList<>();
        int count = 0 ;
        for(int i = 0 ; count<k ; i+=2){
            a.offerLast(i);
            count++;
        }
        System.out.print(a);
        return numbers[a.pollLast()%numbers.length];
    }
}