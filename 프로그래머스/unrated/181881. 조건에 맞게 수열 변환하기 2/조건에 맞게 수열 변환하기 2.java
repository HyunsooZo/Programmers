import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int len = arr.length;
        int cnt = 0;
        int[] arr2 = new int[len];
        arr2 = Arrays.copyOf(arr, len);
       
        while (true) {
            for (int i = 0; i < len; i++) {
                if (arr[i] < 50 && arr[i] % 2 != 0)
                    arr[i] = arr[i] * 2 + 1;
                else if (arr[i] >= 50 && arr[i] % 2 == 0)
                    arr[i] /= 2;
            }
            cnt++;  
            
            if (Arrays.equals(arr, arr2)) return cnt-1;
            
            arr2 = Arrays.copyOf(arr, len);
        }
    }
}
