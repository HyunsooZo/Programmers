class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        val max = str_list.size 
        val lIdx = str_list.indexOf("l")
        val rIdx = str_list.indexOf("r")
        return when {
            lIdx in 0 until (rIdx.takeIf { it >= 0 } ?: max) 
                -> str_list.sliceArray(0 until lIdx)
            rIdx in 0 until (lIdx.takeIf { it >= 0 } ?: max) 
                -> str_list.sliceArray(rIdx + 1 until max)
            else 
                -> emptyArray()
        }
    }
}
