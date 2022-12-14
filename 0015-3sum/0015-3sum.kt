class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val resultList = arrayListOf<List<Int>>()
        val usedNum = hashMapOf<Int, Boolean>()
        var leftIdx = 1
        var rightIdx = nums.size - 1
        val sortedNums = nums.sorted()
        for (i in 0 until nums.size - 2) {
            if (usedNum[sortedNums[i]] == null) {
                leftIdx = i + 1
                rightIdx = nums.size - 1
                var lastLeftValue = sortedNums[i] - 1
                var lastRightValue = sortedNums[rightIdx] + 1
                while (leftIdx < rightIdx) {
                    if (sortedNums[i] < 0 && sortedNums[rightIdx] <= 0) break;
                    else if (sortedNums[i] == 0 && sortedNums[leftIdx] > 0) break;
                    else if (sortedNums[i] > 0) break;
                    val sum = sortedNums[i] + sortedNums[leftIdx] + sortedNums[rightIdx]
                    when {
                        sum > 0 -> rightIdx--
                        sum < 0 -> leftIdx++
                        lastLeftValue == sortedNums[leftIdx] -> leftIdx++
                        lastRightValue == sortedNums[rightIdx] -> rightIdx--
                        else -> {
                            resultList.add(listOf(sortedNums[i], sortedNums[leftIdx], sortedNums[rightIdx]))
                            lastLeftValue = sortedNums[leftIdx]
                            lastRightValue = sortedNums[rightIdx]
                            leftIdx++
                            rightIdx--
                        }
                    }
                }
                usedNum[sortedNums[i]] = true
            }
        }

        return resultList
    }
}