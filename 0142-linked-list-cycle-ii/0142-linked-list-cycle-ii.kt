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
    fun detectCycle(head: ListNode?): ListNode? {
        var mutableHead = head
        val hashMap = hashMapOf<Int, Boolean>()
        while (true) {
            if (hashMap[mutableHead.hashCode()] == null && mutableHead != null) {
                hashMap[mutableHead.hashCode()] = true
                mutableHead = mutableHead?.next
            } else break
        }

        return mutableHead
    }
}