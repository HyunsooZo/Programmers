function solution(a, b) {
    var x = parseInt(String(a) + String(b)), y = 2 * a * b ;
    return x == y ? x : x < y ? y : x ;
}