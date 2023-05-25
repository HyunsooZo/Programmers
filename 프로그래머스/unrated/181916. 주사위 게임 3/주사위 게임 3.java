class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] counts = new int[7]; 
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;
        
        boolean isOneOneTwo = false;
        int maxCount = 0; 
        for (int count : counts) {
            maxCount = Math.max(maxCount, count);
            if(count ==1 ) isOneOneTwo = true;
        }
        
        if (maxCount == 4)  return a * 1111;
        
        if (maxCount == 3) {
            int p = 0 , q = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 3) {
                    p = i;
                } else if (counts[i] == 1) {
                    q = i;
                }
            }     
            return (10 * p + q) * (10 * p + q);
        }
        
        if (maxCount == 2 && !isOneOneTwo) {
            
            int p = 0;
            int q = 0;
            
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    if (p == 0) {
                        p = i;
                    } else {
                        q = i;
                    }
                }
            }
            
            return (p + q) * Math.abs(p - q);
            
        }else if(maxCount ==2 && isOneOneTwo){
            int r = 1 ;
            for(int i = 1; i<= 6; i++){
                if(counts[i]==1){
                    r*=i;
                }
            }
            return r;
        }
        
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1 && i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }
}
