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
    var firstNode: TreeNode? = null
    var secondNode: TreeNode? = null
    var prevNode = TreeNode(Int.MIN_VALUE)

    fun recoverTree(root: TreeNode?): Unit {
        inorder(root)

        val temp = firstNode!!.`val`
        firstNode!!.`val` = secondNode!!.`val`
        secondNode!!.`val` = temp
    }

    private fun inorder(root: TreeNode?) {
        if (root == null) return;

        inorder(root.left)
        if (firstNode == null && prevNode.`val` > root.`val`) firstNode = prevNode
        if (firstNode != null && prevNode.`val` > root.`val`) secondNode = root
        prevNode = root
        inorder(root.right)
    }
}