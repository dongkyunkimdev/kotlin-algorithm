class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var maxLengthPrefix = strs[0]
        strs.forEachIndexed { index, str ->
            var tempStr = ""
            for (i in 0 until kotlin.math.min(maxLengthPrefix.length, str.length)) {
                if (maxLengthPrefix[i] == str[i]) tempStr += maxLengthPrefix[i]
                else break;
            }
            maxLengthPrefix = tempStr
        }

        return maxLengthPrefix
    }
}