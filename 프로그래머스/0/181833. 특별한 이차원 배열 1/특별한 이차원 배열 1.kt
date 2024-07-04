class Solution {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) answer[i][i] = 1
        return answer
    }
}