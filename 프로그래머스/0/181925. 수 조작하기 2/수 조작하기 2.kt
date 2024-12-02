class Solution {
    fun solution(numLog: IntArray): String {
        return numLog.toList()
            .zipWithNext {
                prev, curr -> when (curr - prev) {
                    1 -> "w"  
                    -1 -> "s" 
                    10 -> "d" 
                    -10 -> "a" 
                    else -> ""
                }
            }.joinToString("") 
    }
}
