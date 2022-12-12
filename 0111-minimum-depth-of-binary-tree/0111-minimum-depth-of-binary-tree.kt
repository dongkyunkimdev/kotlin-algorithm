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
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = ArrayDeque<TreeNode>()
        var level = 1
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val currentNode = queue.poll()
                if (currentNode?.left == null && currentNode?.right == null) return level
                if (currentNode?.left != null) {
                    queue.offer(currentNode?.left)
                }
                if (currentNode?.right != null) {
                    queue.offer(currentNode?.right)
                }
            }
            level++
        }

        return level
    }
}