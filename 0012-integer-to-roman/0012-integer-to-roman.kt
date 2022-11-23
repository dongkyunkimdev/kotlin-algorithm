class Solution {
    fun intToRoman(num: Int): String {
        var mutableNum = num
        val normal = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val roman = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        var result = ""

        for (i in normal.indices) {
            while (mutableNum >= normal[i]) {
                result += roman[i]
                mutableNum -= normal[i]
            }
        }

        return result
    }
}