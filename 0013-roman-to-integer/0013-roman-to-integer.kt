class Solution {
    fun romanToInt(s: String): Int {
        var mutableStr = s
        val romans = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        val numbers = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        var sum = 0

        romans.forEachIndexed { index, str ->
            while (mutableStr.length >= str.length && mutableStr.substring(0, str.length) == str) {
                mutableStr = mutableStr.substring(str.length)
                sum += numbers[index]
            }
        }

        return sum
    }
}