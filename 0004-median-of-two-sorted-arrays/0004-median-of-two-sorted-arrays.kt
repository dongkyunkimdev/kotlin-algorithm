class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val arrayList = arrayListOf<Int>()
        nums1.forEach { arrayList.add(it) }
        nums2.forEach { arrayList.add(it) }
        arrayList.sort()
        if (arrayList.size % 2 == 1) return arrayList[arrayList.size / 2].toDouble()
        return (arrayList[arrayList.size / 2] + arrayList[arrayList.size / 2 - 1]) / 2.0
    }
}