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
    fun oddEvenList(head: ListNode?): ListNode? {
        var mutableHead = head
        val oddListNode = ListNode(0)
        var oddCurrentListNode = oddListNode
        val evenListNode = ListNode(0)
        var evenCurrentListNode = evenListNode
        var count = 1

        while (mutableHead != null) {
            if (count % 2 == 1) {
                oddCurrentListNode.next = ListNode(mutableHead.`val`)
                oddCurrentListNode = oddCurrentListNode.next!!
            } else {
                evenCurrentListNode.next = ListNode(mutableHead.`val`)
                evenCurrentListNode = evenCurrentListNode.next!!
            }
            mutableHead = mutableHead.next
            count++
        }
        oddCurrentListNode.next = evenListNode.next

        return oddListNode.next
    }
}