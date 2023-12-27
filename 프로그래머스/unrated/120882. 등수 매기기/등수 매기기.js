function solution(score) {
  const averages = [];
  
  for (const s of score) {
    const average = (s[0] + s[1]) / 2;
    averages.push(average);
  }
  
  const rankings = Array.from({ length: averages.length }, () => 1);
  for (let i = 0; i < averages.length; i++) {
    for (let j = 0; j < averages.length; j++) {
      if (averages[i] < averages[j]) {
        rankings[i]++;
      }
    }
  }
  
  return rankings;
}