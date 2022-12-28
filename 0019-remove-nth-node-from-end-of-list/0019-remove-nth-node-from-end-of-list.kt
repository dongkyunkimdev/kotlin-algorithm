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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var mutableHead = head
        val nodeList = mutableListOf<ListNode>()

        while (mutableHead != null) {
            nodeList.add(mutableHead)
            mutableHead = mutableHead.next
        }
        val target = nodeList[nodeList.size - n]
        mutableHead = head

        while (mutableHead != null) {
            if (mutableHead == target) {
                return mutableHead.next
            }
            if (mutableHead.next == target) {
                mutableHead.next = mutableHead.next?.next
                break
            }
            mutableHead = mutableHead.next
        }

        return head
    }
}