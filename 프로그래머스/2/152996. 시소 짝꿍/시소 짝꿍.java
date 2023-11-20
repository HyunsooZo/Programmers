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

            if (binarySearch(arr[i] * 2)) {
                answer++;
            }

            if (arr[i] % 3 == 0){
                if(binarySearch(arr[i] * 2 / 3)){
                    answer++;
                }
                if(binarySearch(arr[i] * 4 / 3)){
                    answer++;
                }
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

    boolean binarySearch(int target) {
    int left = 0;
    int right = len - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            for (int i = mid + 1; i < len; i++) {
                if (arr[i] == target) {
                    answer++;
                } else {
                    break;
                }
            }
            for (int i = mid - 1; i >= 0; i--) {
                if (arr[i] == target) {
                    answer++;
                } else {
                    break;
                }
            }
            return true;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return false;
}
}