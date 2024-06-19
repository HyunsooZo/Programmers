class Solution {
    fun solution(num_list: IntArray): Int {
        var a = 0
        var b = 0
        num_list.forEachIndexed {
            index, value -> if (index % 2 == 0) a += value else b += value
        }
        return if (a >= b) a else b
    }
}