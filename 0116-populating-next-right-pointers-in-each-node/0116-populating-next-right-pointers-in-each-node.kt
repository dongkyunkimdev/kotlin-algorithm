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
        bfs(root)
        return root
        
    }
    
    fun bfs(root: Node?) {
        if (root == null) return
        val q = LinkedList<Node>()
        q.add(root!!)
        while(!q.isEmpty()) {
            val size = q.size-1
            for (i in 0..size) {
                val currentNode = q.poll()
                if (i != size) {
                    currentNode.next = q.peek()
                }
                currentNode.left?.let {
                    q.add(it)
                }
                currentNode.right?.let {
                    q.add(it)
                }
            }
        }
    }
}