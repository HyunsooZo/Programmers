function solution(num_list) {
    var odd = '';
    var even = '';
    for(let i = 0 ; i < num_list.length ; i++){
        const a = num_list[i];
        if(a%2==0){
            even += a;
        }else{
            odd += a;
        }
    }
    return parseInt(even)+parseInt(odd);
}