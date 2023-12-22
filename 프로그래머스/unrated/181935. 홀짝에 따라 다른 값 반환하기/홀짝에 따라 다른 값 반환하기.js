function solution(n) {
    let answer = 0;
    for (let i = n % 2 === 0 ? 2 : 1; i <= n; i += 2) {
        answer += n % 2 === 0 ? i * i : i;
    }    
    
    return answer;
}
