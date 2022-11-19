class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val sortedArray = nums1.plus(nums2).sorted()
        val mid = sortedArray.size / 2

        return if (sortedArray.size % 2 == 1) {
            sortedArray[mid].toDouble()
        } else {
            (sortedArray[mid] + sortedArray[mid - 1]).toDouble() / 2
        }
    }
}