class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        var leftIdx = 0
        var rightIdx = height.size - 1

        while (leftIdx < rightIdx) {
            maxArea = kotlin.math.max(maxArea, kotlin.math.min(height[leftIdx], height[rightIdx]) * (rightIdx - leftIdx))
            when {
                height[leftIdx] > height[rightIdx] -> rightIdx --
                height[leftIdx] < height[rightIdx] -> leftIdx ++
                else -> {
                    leftIdx++
                    rightIdx--
                }
            }
        }

        return maxArea
    }
}