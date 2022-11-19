class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charMap = hashMapOf<Char, Int>()
        var leftIdx = 0
        var rightIdx = 0
        var maxLength = 0

        while (rightIdx < s.length) {
            if (charMap.containsKey(s[rightIdx]) && charMap[s[rightIdx]]!! >= leftIdx) {
                leftIdx = charMap[s[rightIdx]]!! + 1
            }
            charMap[s[rightIdx]] = rightIdx
            maxLength = maxLength.coerceAtLeast(rightIdx - leftIdx + 1)
            rightIdx++
        }

        return maxLength
    }
}