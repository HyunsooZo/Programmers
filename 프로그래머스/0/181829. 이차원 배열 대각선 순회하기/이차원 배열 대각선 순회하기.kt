class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        return board.flatMapIndexed { 
            i, row -> row.mapIndexed { j, value -> if (i + j <= k) value else 0 }
        }.sum()
    }
}
