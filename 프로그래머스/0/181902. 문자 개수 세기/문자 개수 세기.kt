class Solution {
    fun solution(my_string: String): IntArray {
        val alp = ('A'..'Z') + ('a'..'z') 
        return alp.map { ch -> my_string.count { it == ch }}.toIntArray() 
    }
}
