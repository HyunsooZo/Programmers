class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length , len2 = arr2.length;
        
        if(len1!=len2) return len1>len2?1:-1;
        
        int sum1 = 0 , sum2 = 0;
        
        for(int i=0 ; i <len1 ; i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        if(sum1==sum2) return 0;
        
        return sum1>sum2?1:-1;
    }
}