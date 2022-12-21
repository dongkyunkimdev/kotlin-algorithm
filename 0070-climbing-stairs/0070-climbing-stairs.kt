class Solution {
    fun climbStairs(n: Int): Int {
        if (n <= 3) return n
        val fibonacciList = mutableListOf(0, 1, 2, 3)
        for (i in 4..n) {
            fibonacciList.add(fibonacciList[i - 1] + fibonacciList[i - 2])
        }

        return fibonacciList[n]
    }
}