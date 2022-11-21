class Solution {
    fun isPalindrome(x: Int): Boolean {
        var intString = x.toString()
        if (x < 0) return false
        while (intString.length > 1) {
            if (intString.first() != intString.last()) return false
            intString = intString.substring(1, intString.length - 1)
        }
        return true
    }
}