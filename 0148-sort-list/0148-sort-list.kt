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
    fun sortList(head: ListNode?): ListNode? {
        var mutableHead = head
        var orderedValList = mutableListOf<Int>()
        var resultListNode = ListNode(0)
        var currentListNode = resultListNode

        while (mutableHead != null) {
            orderedValList.add(mutableHead.`val`)
            mutableHead = mutableHead.next
        }
        orderedValList.sort()
        orderedValList.forEach {
            currentListNode.next = ListNode(it)
            currentListNode = currentListNode.next!!
        }

        return resultListNode.next
    }
}