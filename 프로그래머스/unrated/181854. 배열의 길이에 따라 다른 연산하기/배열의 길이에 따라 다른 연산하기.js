const solution = (arr, n) => {
    return arr.map((num, index) => {
        return arr.length % 2 === 0 ? 
            (index % 2 === 1 ? num + n : num) : 
            (index % 2 === 0 ? num + n : num);
    });
};