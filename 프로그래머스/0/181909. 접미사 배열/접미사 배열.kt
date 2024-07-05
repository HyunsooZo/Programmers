class Solution {
    fun solution(my_string: String): Array<String> {
        return my_string.indices.map { my_string.substring(it) }.sorted().toTypedArray()
    }
}