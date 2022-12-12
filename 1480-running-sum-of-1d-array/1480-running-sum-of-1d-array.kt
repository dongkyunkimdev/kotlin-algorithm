class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val sumArray = IntArray(nums.size)
        var sum = 0
        nums.forEachIndexed { index, i ->
            sum += i
            sumArray[index] = sum
        }

        return sumArray
    }
}