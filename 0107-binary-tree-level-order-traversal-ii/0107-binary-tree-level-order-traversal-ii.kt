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
    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val levelOrderList = mutableListOf<MutableList<Int>>()
        preorderTraverse(root, levelOrderList, 0)
        levelOrderList.reverse()

        return levelOrderList
    }

    private fun preorderTraverse(node: TreeNode?, levelOrderList: MutableList<MutableList<Int>>, level: Int) {
        if (node == null) return

        val currentLevelList = levelOrderList.getOrElse(level) { mutableListOf<Int>().also { levelOrderList.add(it) } }
        currentLevelList.add(node.`val`)
        preorderTraverse(node.left, levelOrderList, level + 1)
        preorderTraverse(node.right, levelOrderList, level + 1)
    }
}