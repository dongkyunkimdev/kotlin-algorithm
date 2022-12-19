class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var countOfLand = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j)
                    countOfLand++
                }
            }
        }

        return countOfLand
    }

    private fun dfs(grid: Array<CharArray>, l: Int, h: Int) {
        if (l >= 0 && h >= 0 && l < grid.size && h < grid[0].size && grid[l][h] == '1') {
            grid[l][h] = '0'
            dfs(grid, l - 1, h)
            dfs(grid, l + 1, h)
            dfs(grid, l, h - 1)
            dfs(grid, l, h + 1)
        }
    }
}