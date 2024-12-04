class Solution {
    fun solution(number: String): Int {
        return number.map { it.toString().toInt() }.sum() % 9
    }
}