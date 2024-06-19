class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val list = num_list.toList()
        return (list.subList(n, list.size) + list.subList(0, n)).toIntArray()
    }
}