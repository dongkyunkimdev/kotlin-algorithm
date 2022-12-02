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

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        return isMirror(root.left, root.right)
    }

    private fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left?.`val` != right?.`val`) return false

        return isMirror(left?.left, right?.right) && return isMirror(left?.right, right?.left)
    }

}