import java.util.*

/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        if (root == null) return null
        val queue = ArrayDeque<Node>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val queueSize = queue.size
            for (i in 0 until queueSize) {
                val currentNode = queue.poll()
                if (i + 1 < queueSize) {
                    currentNode.next = queue.peek()
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left)
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right)
                }
            }
        }

        return root
    }
}