class Solution {
    static int target;
    static int count;

    public int solution(int[] numbers, int target) {
        this.target = target;
        calculate(numbers, 0, 0);
        return count;
    }

    private void calculate(int[] arr, int index, int sum) {
        if (index == arr.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        calculate(arr, index + 1, sum + arr[index]);
        calculate(arr, index + 1, sum - arr[index]);
    }
}
