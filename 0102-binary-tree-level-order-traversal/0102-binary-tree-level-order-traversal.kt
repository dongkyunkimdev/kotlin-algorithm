/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val resultList = mutableListOf<MutableList<Int>>()
        preorderTraverse(root, resultList, 0)
        return resultList
    }

    private fun preorderTraverse(node: TreeNode?, resultList: MutableList<MutableList<Int>>, level: Int) {
        if (node == null) return

        val currentLevelList = resultList.getOrElse(level) { mutableListOf<Int>().also { resultList.add(it) } }
        currentLevelList.add(node.`val`)

        preorderTraverse(node.left, resultList, level + 1)
        preorderTraverse(node.right, resultList, level + 1)
    }
}