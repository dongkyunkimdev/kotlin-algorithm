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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        else if (list2 == null) return list1

        var mutableList1 = list1
        var mutableList2 = list2
        val mergedListNode = ListNode(0)
        var currentListNode = mergedListNode

        while (mutableList1 != null && mutableList2 != null) {
            when {
                mutableList1.`val` <= mutableList2.`val` -> {
                    currentListNode.next = ListNode(mutableList1.`val`)
                    mutableList1 = mutableList1.next
                }
                else -> {
                    currentListNode.next = ListNode(mutableList2.`val`)
                    mutableList2 = mutableList2.next
                }
            }
            currentListNode = currentListNode.next!!
        }
        if (mutableList1 == null) {
            currentListNode.next = mutableList2
        } else {
            currentListNode.next = mutableList1
        }

        return mergedListNode.next
    }

}