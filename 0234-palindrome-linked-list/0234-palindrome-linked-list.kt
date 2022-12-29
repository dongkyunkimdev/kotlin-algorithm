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
    fun isPalindrome(head: ListNode?): Boolean {
        var mutableHead = head
        val nodeList = mutableListOf<ListNode>()

        while (mutableHead != null) {
            nodeList.add(mutableHead)
            mutableHead = mutableHead.next
        }
        var left = 0
        var right = nodeList.size - 1
        while (left <= right) {
            if (nodeList[left].`val` != nodeList[right].`val`) return false
            left++
            right--
        }

        return true
    }
}