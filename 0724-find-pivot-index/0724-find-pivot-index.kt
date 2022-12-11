class Solution {
    fun pivotIndex(nums: IntArray): Int {
        nums.forEachIndexed { index, i ->
            if (sumLeft(nums, index) == sumRight(nums, index)) return index
        }

        return -1
    }

    private fun sumRight(nums: IntArray, index: Int): Int {
        if (index == nums.size - 1) return 0
        var sum = 0
        for (i in index + 1 until nums.size) {
            sum += nums[i]
        }

        return sum
    }

    private fun sumLeft(nums: IntArray, index: Int): Int {
        if (index == 0) return 0
        var sum = 0
        for (i in 0 until index) {
            sum += nums[i]
        }

        return sum
    }
}