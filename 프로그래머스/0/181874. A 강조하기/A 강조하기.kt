class Solution {
    fun solution(myString: String): String {
        return myString.map {
            when (it) {
                'a' -> 'A'
                in 'B'..'Z' -> it.lowercaseChar()
                else -> it
            }
        }.joinToString("")
    }
}