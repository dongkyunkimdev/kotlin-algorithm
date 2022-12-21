class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val countOfWay = Array(m) { IntArray(n) }
        for (i in 0 until n) {
            countOfWay[0][i] = 1
        }
        for (i in 0 until m) {
            countOfWay[i][0] = 1
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                countOfWay[i][j] = countOfWay[i - 1][j] + countOfWay[i][j - 1]
            }
        }

        return countOfWay[m - 1][n - 1]
    }
}