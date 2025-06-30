class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs(int[] arr, int index, int sum, int target) {
        if (index == arr.length) {
            return sum == target ? 1 : 0;
        }
        return dfs(arr, index + 1, sum + arr[index], target) + 
               dfs(arr, index + 1, sum - arr[index], target);
    }
}
