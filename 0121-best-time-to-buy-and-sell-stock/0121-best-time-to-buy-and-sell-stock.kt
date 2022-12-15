import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        var min = Int.MAX_VALUE

        for (i in prices.indices) {
            when {
                prices[i] < min -> min = prices[i]
                prices[i] > min -> max = max(prices[i] - min, max)
            }
        }

        return max
    }
}