import kotlin.math.abs

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        val sortedNums = nums.sorted()
        val maxLength = nums.size
        var leftIdx = 0
        var rightIdx = nums.size - 1
        var closest = sortedNums[0] + sortedNums[1] + sortedNums[2]

        for (firstIdx in 0 until maxLength - 2) {
            leftIdx = firstIdx + 1
            rightIdx = maxLength - 1
            while (leftIdx < rightIdx) {
                val sum = sortedNums[firstIdx] + sortedNums[leftIdx] + sortedNums[rightIdx]
                (abs(sum - target))?.takeIf { it < abs(closest - target) }?.let { closest = sum }
                when {
                    sum == target -> return sum
                    sum < target -> leftIdx++
                    sum > target -> rightIdx--
                }
            }
        }

        return closest
    }
}