class Solution {
    fun solution(myString: String, pat: String): Int {
        val replacedString = swapAandB(myString)
        return if (replacedString.contains(pat)) 1 else 0
    }
    fun swapAandB(str: String): String {
        return str.map { 
            when (it) {
                'A' -> 'B'
                'B' -> 'A'
                else -> it
            }
        }.joinToString("")
    }
}
