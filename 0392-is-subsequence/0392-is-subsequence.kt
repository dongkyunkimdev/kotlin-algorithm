class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var mutableStr = t
        for (i in s.indices) {
            val sCharIndex = mutableStr.indexOf(s[i])
            if (sCharIndex == -1) return false
            mutableStr.substring(sCharIndex + 1).also { mutableStr = it }
        }

        return true
    }
}