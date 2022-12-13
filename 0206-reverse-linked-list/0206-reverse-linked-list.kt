import java.util.*

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
    fun reverseList(head: ListNode?): ListNode? {
        var mutableHead = head
        val listNodeStack = Stack<ListNode>()
        val reverseListNode = ListNode(0)
        var currentListNode = reverseListNode

        while (mutableHead != null) {
            listNodeStack.add(ListNode(mutableHead.`val`))
            mutableHead = mutableHead.next
        }
        while (listNodeStack.isNotEmpty()) {
            currentListNode.next = listNodeStack.pop()
            currentListNode = currentListNode.next!!
        }

        return reverseListNode.next
    }
}