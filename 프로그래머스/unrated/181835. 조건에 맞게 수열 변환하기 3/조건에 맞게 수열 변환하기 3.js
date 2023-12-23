function solution(arr, k) {
    const isEven = k % 2 == 0 ;
    for(let i = 0 ; i < arr.length ; i++){
        if(isEven){
            arr[i] += k; 
        }else{
            arr[i] *= k ;   
        }
    }
    return arr;
}