class Solution {
    fun longestPalindrome(s: String): Int {
        var longestPalindrome = 0
        var oddCount = 0
        val charCountMap = hashMapOf<Char, Int>()

        s.forEach {
            charCountMap[it] = charCountMap.getOrDefault(it, 0) + 1
        }
        for (key in charCountMap.keys) {
            when {
                charCountMap[key]!! % 2 == 0 -> longestPalindrome += charCountMap[key]!!
                else -> {
                    longestPalindrome += charCountMap[key]!! - 1
                    oddCount++
                }
            }
        }
        if (oddCount > 0) longestPalindrome++

        return longestPalindrome
    }
}