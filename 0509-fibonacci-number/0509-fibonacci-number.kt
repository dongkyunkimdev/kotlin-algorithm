class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n
        val fibList = mutableListOf(0, 1)
        for (i in 2..n) {
            fibList.add(fibList[i - 1] + fibList[i - 2])
        }
        return fibList[n]
    }
}