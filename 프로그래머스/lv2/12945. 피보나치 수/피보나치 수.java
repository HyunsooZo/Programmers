import java.util.*;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for(int i =2 ; i<=n ; i++){
            int a = (fib.get(i-1)+fib.get(i-2))%1234567;
            fib.add(a);
        }
        return (int)fib.get(n);
    }
}