function solution(a, b) {
    var answer = 0;
    var isAEven = a % 2 == 0 ;
    var isBEven = b % 2 == 0 ;
    if(!isAEven && !isBEven){
        return Math.pow(a,2) + Math.pow(b,2);
    }
    return isAEven && isBEven ? Math.abs(a - b) : 2*(a+b);
}