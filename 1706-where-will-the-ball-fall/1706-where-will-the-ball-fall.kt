class Solution {
    fun findBall(grid: Array<IntArray>): IntArray {
        val resultList = mutableListOf<Int>()
        while (resultList.size < grid[0].size) {
            var i = 0
            var j = resultList.size
            while (i < grid.size) {
                if ((j + 1 < grid[0].size && grid[i][j] == 1 && grid[i][j + 1] == -1) ||
                    (j - 1 >= 0 && grid[i][j] == -1 && grid[i][j - 1] == 1) ||
                    (j == 0 && grid[i][j] == -1) ||
                    (j == grid[0].size - 1 && grid[i][j] == 1)
                ) {
                    resultList.add(-1)
                    break
                }

                if (grid[i][j] == 1) {
                    j++
                } else {
                    j--
                }
                i++

                if (i == grid.size) resultList.add(j)
            }
        }

        return resultList.toIntArray()
    }
}