import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int left = -1;
        int right = -1;
        
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2) {
                left = i;
                break;
            }
        }
        
        for (int i = len - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                right = i;
                break;
            }
        }
        
        if (left == -1 || right == -1) {
            return new int[]{-1};
        } else {
            return Arrays.copyOfRange(arr, left, right + 1);
        }
    }
}
