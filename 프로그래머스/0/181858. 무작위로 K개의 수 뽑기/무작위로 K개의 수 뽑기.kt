class Solution {
    fun solution(
        arr: IntArray, 
        k: Int
    ): List<Int> {
        return arr.distinct()
            .take(k) 
            .let { result -> result + List(k - result.size) { -1 } }
    }
}