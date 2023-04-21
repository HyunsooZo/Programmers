class Solution{    
    static int cnt;
    public int solution(int n, int a, int b){
        return round(a,b);
    }
    public int round(int a, int b){
        int r1 = (a+1)/2 , r2 = (b+1)/2;
        cnt++;
        if(r1==r2) return cnt;
        return round(r1,r2);
    }
}