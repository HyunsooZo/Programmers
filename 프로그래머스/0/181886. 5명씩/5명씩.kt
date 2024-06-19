class Solution {
    fun solution(names: Array<String>): Array<String> {
        val result = mutableListOf<String>()
        for (i in names.indices step 5) {
            result.add(names[i])
        }
        return result.toTypedArray()
    }
}