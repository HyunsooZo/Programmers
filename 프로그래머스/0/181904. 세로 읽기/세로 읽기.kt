class Solution {
    fun solution(
        my_string: String, 
        m: Int, 
        c: Int
    ): String {
        return my_string.chunked(m)
            .mapNotNull { it.getOrNull(c - 1) }
            .joinToString("") 
    }
}