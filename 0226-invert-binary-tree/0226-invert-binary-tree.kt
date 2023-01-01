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
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return root
        val queue = ArrayDeque<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val currentNode = queue.poll()
            val left = currentNode.left
            currentNode.left = currentNode.right
            currentNode.right = left

            if (currentNode.left != null) queue.offer(currentNode.left)
            if (currentNode.right != null) queue.offer(currentNode.right)
        }

        return root
    }
}