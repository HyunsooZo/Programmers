class Solution {
    fun solution(
        a: Int, 
        d: Int, 
        included: BooleanArray
    ): Int {
        return included.mapIndexed { 
            index, isIncluded -> if (isIncluded) a + index * d else 0}.sum()
    }
}