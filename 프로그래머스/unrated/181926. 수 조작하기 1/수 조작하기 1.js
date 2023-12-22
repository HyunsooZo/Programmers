function solution(n, control) {
    let answer = n;

    const actions = {
        'w': () => answer++,
        's': () => answer--,
        'd': () => answer += 10,
        'a': () => answer -= 10,
    };

    for (let i = 0; i < control.length; i++) {
        actions[control[i]]();
    }

    return answer;
}
