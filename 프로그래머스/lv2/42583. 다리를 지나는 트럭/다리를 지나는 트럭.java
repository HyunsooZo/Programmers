import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> trucks = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        for (int i : truck_weights) {
            trucks.offer(i);
        }

        int currentWeight = 0;
        while (!trucks.isEmpty()) {
            if (bridge.size() == bridge_length) {
                currentWeight -= bridge.poll();
            }

            if (currentWeight + trucks.peek() <= weight) {
                int truck = trucks.poll();
                bridge.offer(truck);
                currentWeight += truck;
            } else {
                bridge.offer(0);
            }

            answer++;
        }

        answer += bridge_length;
        return answer;
    }
}
