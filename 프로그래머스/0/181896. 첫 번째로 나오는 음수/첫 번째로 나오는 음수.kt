class Solution {
    fun solution(num_list: IntArray): Int {
        num_list.forEachIndexed { index,value -> if( value < 0) return index }
        return -1
    }
}