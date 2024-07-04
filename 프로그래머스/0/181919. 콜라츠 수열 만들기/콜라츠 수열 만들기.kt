class Solution {
    fun solution(n: Int): IntArray {
        val answer = mutableListOf<Int>()
        var cur = n
        while (cur > 1) {
            answer.add(cur)
            cur = if (cur % 2 == 0) cur / 2 else cur * 3 + 1
        }
        answer.add(1)
        return answer.toIntArray()
    }
}