import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        List<int[]> list = new ArrayList<>();

        int gok =picks[0]+picks[1]+picks[2];

        for(int i=0;i<minerals.length;i+=5){
            if(gok==0) break;
            int sum=0,diamond=0,iron=0,stone=0;
            gok--;
            for(int j=i;j<i+5;j++){
                if(j==minerals.length){
                    break;
                }
                
                String type =minerals[j];

                if(type.equals("diamond")){
                    sum+=25;
                    diamond++;
                }else if(type.equals("iron")){
                    sum+=5;
                    iron++;
                }else{
                    sum+=1;
                    stone++;
                }
            }
            list.add(new int[]{sum,diamond,iron,stone});
        }

        Collections.sort(list,(a,b)->(b[0]-a[0]));

        int idx = -1;

        for(int i=0;i<list.size();i++){

            int dia=list.get(i)[1];
            int iron= list.get(i)[2];
            int stone= list.get(i)[3];

            if(picks[0]>=1){
                answer+=dia+iron+stone;
                picks[0]--;
            }else if(picks[1]>=1){
                answer+=dia*5+iron+stone;
                picks[1]--;
            }else if(picks[2]>=1){
                answer+=list.get(i)[0];
                picks[2]--;
            }else {
                break;
            }
        }
        return answer;
    }
}