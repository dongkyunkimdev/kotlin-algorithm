class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { idx, value ->
            val goal = target - value
            map[goal]?.let { return intArrayOf(it, idx) }
            map[value] = idx
        }

        return intArrayOf(-1, -1)
    }
}