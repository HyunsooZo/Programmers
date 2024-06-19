class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        val answer = StringBuilder()
        
        my_strings.forEachIndexed { 
            index, str -> val (start, end) = parts[index]
            answer.append(str.substring(start, end + 1))
        }
        
        return answer.toString()
    }
}