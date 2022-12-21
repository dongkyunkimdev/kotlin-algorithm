import kotlin.math.min

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dpList = mutableListOf(cost[0], cost[1])
        for (i in 2 until cost.size) {
            dpList.add(min(cost[i] + dpList[i - 1], cost[i] + dpList[i - 2]))
        }
        return min(dpList[cost.size - 1], dpList[cost.size - 2])
    }
}