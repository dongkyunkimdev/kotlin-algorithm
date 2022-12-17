import java.util.*

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
        if (root == null) return emptyList()
        val nodeQueue = ArrayDeque<TreeNode>()
        val resultList = mutableListOf<List<Int>>()

        nodeQueue.offer(root)
        while (nodeQueue.isNotEmpty()) {
            val size = nodeQueue.size
            val currentLevelList = mutableListOf<Int>()
            for (i in 0 until size) {
                val currentNode = nodeQueue.poll()
                currentLevelList.add(currentNode.`val`)
                if (currentNode.left != null) nodeQueue.offer(currentNode.left)
                if (currentNode.right != null) nodeQueue.offer(currentNode.right)
            }
            resultList.add(currentLevelList)
        }

        return resultList
    }
}