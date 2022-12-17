/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val resultList = mutableListOf<Int>()
        preorderTraverse(root, resultList)

        return resultList
    }

    private fun preorderTraverse(root: Node?, resultList: MutableList<Int>) {
        if (root == null) return

        resultList.add(root.`val`)
        root.children.forEach {
            preorderTraverse(it, resultList)
        }
    }
}