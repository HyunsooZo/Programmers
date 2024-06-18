class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.mapIndexed ({ 
            index, str -> if (index % 2 == 0) str.lowercase() else str.uppercase()
        }).toTypedArray()
    }
}
