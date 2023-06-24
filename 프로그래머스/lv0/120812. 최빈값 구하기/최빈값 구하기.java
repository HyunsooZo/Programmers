class Solution {
    public int solution(int[] array) {
        int[] cnt = new int[1000];
        
        for(int i : array) cnt[i]++;
        
        int idx = 0, max = 0 , duplication = 0 ;
        
        for(int i = 0 ; i < cnt.length ; i++) {
            if(cnt[i]>max){
                max = cnt[i];
                idx = i;
            }
        }
        
        for(int i : cnt) {
            if(i==max) duplication++;
        }
        
        return duplication==1?idx:-1;
    }
}