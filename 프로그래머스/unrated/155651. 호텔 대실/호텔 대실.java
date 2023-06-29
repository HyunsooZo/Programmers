import java.util.*;

class Reservation {
    int startTime;
    int endTime;

    public Reservation(String start, String end) {
        this.startTime = convertTimeToMinutes(start);
        this.endTime = convertTimeToMinutes(end);
    }

    private int convertTimeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}

class Solution {
    public int solution(String[][] book_time) {
        int len = book_time.length;
        int answer = 0;

        List<Reservation> reservations = new ArrayList<>();
        for (String[] s : book_time) {
            Reservation temp = new Reservation(s[0], s[1]);
            reservations.add(temp);
        }

        Collections.sort(reservations, 
                         Comparator.comparingInt(r -> r.startTime));

        PriorityQueue<Integer> endTimeQueue = new PriorityQueue<>();
        for (Reservation reservation : reservations) {
            if (!endTimeQueue.isEmpty() && 
                endTimeQueue.peek() <= reservation.startTime) {
                endTimeQueue.poll(); 
            } else {
                answer++; 
            }
            endTimeQueue.offer(reservation.endTime + 10); 
        }

        return answer;
    }
}
