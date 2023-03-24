class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for(long i = 1; i<=count ; i++){
            total += i*price;
        }
        return money>=total?0:total-(long)money;
    }
}