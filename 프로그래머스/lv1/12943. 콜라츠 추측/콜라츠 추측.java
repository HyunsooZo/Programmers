class Solution {
    public int solution(double num) {
        int i = 0;
        if(num==0){
            return i;
        }
        while(num>=1){
            if (num%2==0){
                num /=2;
                i++;
                if(num==1){
                    return i;
                }
            }else if(num==1){
                return i;
        }else {
                num = num*3+1;
                i++;
            }
            if(i==500&&num!=1){ 
              i= -1;
              return i;
            }        
        }
        return i;
    }
}