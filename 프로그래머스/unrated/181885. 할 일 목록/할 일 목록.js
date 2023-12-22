function solution(todo_list, finished) {
    var answer = [];
    let idx = 0;
    for(let i = 0 ; i < todo_list.length ; i++){
        if(!finished[i]){
            answer[idx++] = todo_list[i];
        }
    }
    return answer;
}