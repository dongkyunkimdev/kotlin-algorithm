class Solution {
    fun fib(n: Int): Int {
        if (n <= 1) return n
        var result = 0
        val array = arrayOf(0, 1)
        if (n < array.size) {
            result = array[n]
        } else {
            result = fib(n - 1) + fib(n - 2)
            array.plus(result)
        }

        return result
    }
}