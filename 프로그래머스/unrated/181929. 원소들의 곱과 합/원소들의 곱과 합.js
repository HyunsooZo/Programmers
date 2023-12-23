function solution(num_list) {
    const product = 
          num_list.reduce((acc, val) => acc * val, 1);
    const sum = 
          num_list.reduce((acc, val) => acc + val, 0);
    return product < Math.pow(sum, 2) ? 1 : 0;
}
