import java.util.*;
public class Solution {
    public int solution(String[][] clothes){
        HashMap<String,Integer> hm = new HashMap<>();
        int answer = 1;
        //1. 옷을 종류별로 구별한다. getOrDefault 를 써서 값이 있으면 그 값을, 없으면 0을 반환
        for (int i = 0; i <clothes.length ; i++) {
            hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1],0)+1);
        }
        //2.입지않는 경우를 추가하여 곱함. (경우의수 구하기)
        //예: 헤드기어 {노란모자,녹색터번,안입음} ,안경{선글라스,안입음} -> 헤드기어(3) * 안경(2) = 6
        for (int i: hm.values()){
            answer *= i+1; //
    }
        //3. 아무종류도  입지 않은 경우를 뺌. (아무것도 안입음 , 아무것도 안입음 ) 의 케이스 빼주기.
        return answer-1;
    }
}