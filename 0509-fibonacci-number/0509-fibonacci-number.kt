class Solution {
    fun fib(n: Int): Int {
        return if (n <= 1) n
        else fib(n - 1) + fib(n - 2)
    }
}