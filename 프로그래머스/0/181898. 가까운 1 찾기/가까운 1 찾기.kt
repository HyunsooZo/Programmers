class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        for (index in idx until arr.size) {
            if (arr[index] == 1) return index
        }
        return -1
    }
}
