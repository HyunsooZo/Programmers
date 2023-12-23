function solution(arr1, arr2) {
    const sum1 = arr1.reduce((a,b)=> a + b , 0), 
          sum2 = arr2.reduce((a,b)=> a + b , 0);
    const len1 = arr1.length, len2 = arr2.length;
    if(len1 != len2){
        return len1 > len2 ? 1 : -1 ;
    }
    return sum1 == sum2 ? 0 : sum1 > sum2 ? 1 : -1 ;
}