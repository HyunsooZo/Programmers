class Solution {
    fun solution(arr: Array<IntArray>): Int {
        val n = arr.size
        return if ((0 until n).all { i -> (0 until n).all { j -> arr[i][j] == arr[j][i] }}) 1 else 0
    }
}