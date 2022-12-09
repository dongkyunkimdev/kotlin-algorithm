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
            val size = queue.size
            for (i in 0 until size) {
                val currentQueue = queue.poll()
                if (i + 1 < size) {
                    currentQueue.next = queue.peek()
                }
                currentQueue.left?.let { queue.offer(it) }
                currentQueue.right?.let { queue.offer(it) }
            }
        }

        return root
    }
}