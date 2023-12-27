function solution(chicken) {
    let coupons = 0;     
    while (chicken >= 10) {
        const freeChickens = Math.floor(chicken / 10); 
        coupons += freeChickens; 
        chicken = freeChickens + (chicken % 10); 
    }
    return coupons;
}