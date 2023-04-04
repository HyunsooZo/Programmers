import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
         Queue<Integer> bridge = new LinkedList<>();
        int curWeight = 0;
        int time = 0;
        
        for(int i=0; i<truck_weights.length; i++) {
            int truckWeight = truck_weights[i];
            
            while(true) {
                if(bridge.isEmpty()) { // 다리에 트럭이 없는 경우
                    bridge.add(truckWeight);
                    curWeight += truckWeight;
                    time++;
                    break;
                } else if(bridge.size() == bridge_length) { // 다리가 가득 찬 경우
                    curWeight -= bridge.poll();
                } else { // 다리에 트럭이 있는데 무게를 견딜 수 있는 경우
                    if(curWeight + truckWeight > weight) {
                        bridge.add(0); // 0을 추가하여 트럭 대신 다리의 길이를 늘림
                        time++;
                    } else {
                        bridge.add(truckWeight);
                        curWeight += truckWeight;
                        time++;
                        break;
                    }
                }
            }
        }
        
        return time + bridge_length; // 마지막 트럭이 다리를 건너는 시간을 더해줌
    }
}