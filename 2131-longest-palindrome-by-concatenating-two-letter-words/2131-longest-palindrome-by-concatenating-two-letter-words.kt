class Solution {
    fun longestPalindrome(words: Array<String>): Int {
        var longestPalindromeLength = 0
        var unpairSameStringLength = 0
        var strMap = hashMapOf<String, Int>()

        for (str in words) {
            if (!strMap.containsKey(str)) {
                strMap[str] = 0
            }
            strMap[str] = strMap[str]!! + 1
            if (str[0] == str[1]) {
                if (strMap[str] == 2) {
                    strMap[str] = 0
                    longestPalindromeLength += 4
                    unpairSameStringLength--
                } else {
                    strMap[str] = 1
                    unpairSameStringLength++
                }
            } else {
                val reversed = str.reversed()
                if (strMap.containsKey(reversed) && strMap[reversed]!! > 0) {
                    strMap[str] = strMap[str]!! - 1
                    strMap[reversed] = strMap[reversed]!! - 1
                    longestPalindromeLength += 4
                }
            }
        }
        if (unpairSameStringLength > 0) {
            longestPalindromeLength += 2
        }

        return longestPalindromeLength
    }
}