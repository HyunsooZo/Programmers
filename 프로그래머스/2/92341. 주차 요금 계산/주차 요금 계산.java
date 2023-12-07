import java.util.*;

class Car implements Comparable<Car> {
    int num;
    int time;

    public Car(int num, int time) {
        this.num = num;
        this.time = time;
    }

    @Override
    public int compareTo(Car o) {
        return this.num - o.num;
    }
}

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<Integer, Integer> entryTimeMap = new HashMap<>();
        Map<Integer, Integer> parkingTimeMap = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        for (String record : records) {
            String[] log = record.split(" ");
            String[] time = log[0].split(":");
            int currentTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            int carNumber = Integer.parseInt(log[1]);

            if (log[2].equals("IN")) {
                entryTimeMap.put(carNumber, currentTime);
                System.out.println("in! : " + carNumber);
            } else {
                int parkedTime = currentTime - entryTimeMap.get(carNumber);
                parkingTimeMap.put(carNumber, parkingTimeMap.getOrDefault(carNumber, 0) + parkedTime);
                entryTimeMap.remove(carNumber);
                System.out.println("out! : " + carNumber);
            }
        }

        for (int carNumber : entryTimeMap.keySet()) {
            int currentTime = 23 * 60 + 59;
            int parkedTime = currentTime - entryTimeMap.get(carNumber);
            parkingTimeMap.put(carNumber, parkingTimeMap.getOrDefault(carNumber, 0) + parkedTime);
        }

        for (int carNumber : parkingTimeMap.keySet()) {
            int totalParkingTime = parkingTimeMap.get(carNumber);
            int totalFee = defaultFee;

            if (totalParkingTime > defaultTime) {
                totalParkingTime -= defaultTime;
                totalFee += (totalParkingTime + unitTime - 1) / unitTime * unitFee;
            }

            cars.add(new Car(carNumber, totalFee));
        }

        Collections.sort(cars);

        int[] result = new int[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            result[i] = cars.get(i).time;
        }

        return result;
    }
}
