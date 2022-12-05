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

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
        val levelTraverseList = mutableListOf<MutableList<Int>>()
        inorderTraverse(root, levelTraverseList, 0)
        zigzagOrder(levelTraverseList)
        
        return levelTraverseList
    }

    private fun zigzagOrder(levelTraverseList: MutableList<MutableList<Int>>) {
        levelTraverseList.forEachIndexed { index, i ->
            if (index % 2 == 1) {
                levelTraverseList[index].reverse()
            }
        }
    }

    private fun inorderTraverse(node: TreeNode?, levelTraverseList: MutableList<MutableList<Int>>, level: Int) {
        if (node == null) return

        val currentLevelList = levelTraverseList.getOrElse(level) { mutableListOf<Int>().also { levelTraverseList.add(it) } }
        currentLevelList.add(node.`val`)
        inorderTraverse(node.left, levelTraverseList, level + 1)
        inorderTraverse(node.right, levelTraverseList, level + 1)
    }

}