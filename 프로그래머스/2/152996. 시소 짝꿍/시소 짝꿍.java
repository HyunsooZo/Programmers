import java.util.Arrays;

public class Solution {
    static long answer = 0;
    static int[] arr ;
    static int len;

    public long solution(int[] weights) {
        arr = weights;
        len = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < len; i++) {
            findSameValues(i);

            if (binarySearch(arr, arr[i] * 2)) {
                answer++;
            }

            if (arr[i] % 3 == 0 && binarySearch(arr, arr[i] * 2 / 3)) {
                answer++;
            }

            if (arr[i] % 3 == 0 && binarySearch(arr, arr[i] * 4 / 3)) {
                answer++;
            }
        }

        return answer;
    }
    
    void findSameValues(int val){
        for (int i = val + 1; i < len; i++) {
                if (arr[i] == arr[val]) {
                    answer++;
                } else {
                    break;
                }
            }
    }

    boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left >= len || left < 0) {
            return false;
        }

        if (arr[left] == target) {
            for (int i = left + 1; i < arr.length; i++) {
                if (arr[left] == arr[i]) {
                    answer++;
                } else {
                    break;
                }
            }
        }

        return arr[left] == target;
    }
}