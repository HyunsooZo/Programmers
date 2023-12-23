function solution(arr) {
    return arr.map(c => {
        if (c >= 50 && c % 2 === 0) return c / 2;
        else if (c < 50 && c % 2 !== 0) return c * 2;
        else return c;
    });
}
