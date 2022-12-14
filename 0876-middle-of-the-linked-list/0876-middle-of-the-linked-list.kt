/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var mutableHead = head
        var size = 0

        while (mutableHead != null) {
            size++
            mutableHead = mutableHead.next
        }
        mutableHead = head
        for (i in 0 until size / 2) {
            mutableHead = mutableHead?.next
        }

        return mutableHead
    }
}