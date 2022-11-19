class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charMap = hashMapOf<Char, Int>()
        var leftIdx = 0
        var maxLength = 0

        s.forEachIndexed { rightIdx, currentChar ->
            charMap[currentChar]?.takeIf { it >= leftIdx }?.let {
                leftIdx = it + 1
            }
            maxLength = kotlin.math.max(maxLength, rightIdx - leftIdx + 1)
            charMap[currentChar] = rightIdx
        }

        return maxLength
    }
}