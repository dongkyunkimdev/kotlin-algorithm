import kotlin.math.pow

class Solution {

    private val nMap = hashMapOf<Int, Boolean>()
    fun isHappy(n: Int): Boolean {
        if (n == 1) return true
        if (nMap.contains(n)) return false
        nMap[n] = true

        var newN = 0
        val nString = n.toString()
        for (i in nString.indices) {
            newN += nString.substring(i, i + 1).toDouble().pow(2).toInt()
        }

        return isHappy(newN)
    }
}