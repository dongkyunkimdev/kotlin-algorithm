class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sIndexMap = hashMapOf<Char, Int>()
        val tIndexMap = hashMapOf<Char, Int>()
        for (i in s.indices) {
            sIndexMap.getOrElse(s[i]) { sIndexMap.put(s[i], i) }
            tIndexMap.getOrElse(t[i]) { tIndexMap.put(t[i], i) }
            if (sIndexMap[s[i]] != tIndexMap[t[i]]) return false
        }

        return true
    }
}