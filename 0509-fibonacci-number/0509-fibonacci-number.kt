class Solution {
    fun fib(n: Int): Int {
        val array = arrayOf(0, 1)
        if (n < array.size) {
            return array[n]
        } else {
            val result = fib(n - 1) + fib(n - 2)
            array.plus(result)
            return result
        }
    }
}