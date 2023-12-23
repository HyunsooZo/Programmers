function solution(num_list) {
    var a = num_list[num_list.length-1] , b = num_list[num_list.length-2];
    num_list.push(a > b ? a - b : a * 2 );
    return num_list;
}