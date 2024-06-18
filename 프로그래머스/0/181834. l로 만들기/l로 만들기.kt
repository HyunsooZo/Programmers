class Solution {
    fun solution(myString: String): String {
        return myString.map { isEarlierThanL(it) }.joinToString("")
    }
    
    fun isEarlierThanL(ch: Char): Char {
        return if (ch < 'l') 'l' else ch
    }
}
