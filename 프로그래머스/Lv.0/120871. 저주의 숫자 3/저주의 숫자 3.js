function solution(n) {
    let tenBaseNumber = 1, townNumber = 1

    while(n>tenBaseNumber){
        tenBaseNumber++
        townNumber++

        while(townNumber % 3 === 0 || String(townNumber).includes('3')){
            townNumber++
        }
    }

    return townNumber
}