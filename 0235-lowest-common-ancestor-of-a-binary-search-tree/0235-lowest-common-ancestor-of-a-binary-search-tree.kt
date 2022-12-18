/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var mutableRoot = root
        while (true) {
            when {
                mutableRoot!!.`val` > p!!.`val` && mutableRoot.`val` > q!!.`val` -> mutableRoot = mutableRoot.left
                mutableRoot.`val` < p.`val` && mutableRoot.`val` < q!!.`val` -> mutableRoot = mutableRoot.right
                else -> return mutableRoot
            }
        }
    }
}