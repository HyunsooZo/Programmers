class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0 ; i < queries.length ; i++){
            swap(arr,queries[i][0],queries[i][1]);
        }
        return arr;
    }
    public void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
}
}