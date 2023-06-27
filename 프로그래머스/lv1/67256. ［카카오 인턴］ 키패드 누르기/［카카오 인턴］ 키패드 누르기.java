class Solution {
    public int[][] keypadCoordinates = 
    {{3, 1}, {0, 0}, {0, 1}, {0, 2},
             {1, 0}, {1, 1}, {1, 2},
             {2, 0}, {2, 1}, {2, 2},
             {3, 0}, {3, 2}};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;  
        int right = 12; 
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                String preferredHand = 
                    getPreferredHand(number, left, right, hand);
                if (preferredHand.equals("L")) {
                    answer.append("L");
                    left = number;
                } else {
                    answer.append("R");
                    right = number;
                }
            }
        }
        
        return answer.toString();
    }
    
    private String getPreferredHand(int number, int left, 
                                    int right, String hand) {
        
        int[] leftCoord = getCoord(left);
        int[] rightCoord = getCoord(right);
        int[] targetCoord = getCoord(number);
        
        int leftD = distance(leftCoord, targetCoord);
        int rightD = distance(rightCoord, targetCoord);
        
        if (leftD < rightD) return "L";
        else if (leftD > rightD) return "R";
        else return hand.equals("left")?"L":"R";

    }
    
    private int[] getCoord(int position) {
        if (position == 10) return new int[]{3, 0};
        else if (position == 12) return new int[]{3, 2};
        
        return keypadCoordinates[position];
    }
    
    private int distance(int[] source, int[] target) {
        return Math.abs(source[0] - target[0]) 
            + Math.abs(source[1] - target[1]);
    }
}
