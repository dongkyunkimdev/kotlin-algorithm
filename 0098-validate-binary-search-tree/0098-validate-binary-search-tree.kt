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
    fun isValidBST(root: TreeNode?): Boolean {
        var inorderList = mutableListOf<Int>()
        inorder(root, inorderList)
        return isValidBSTList(inorderList)
    }

    private fun isValidBSTList(inorderList: MutableList<Int>): Boolean {
        for (i in 0 until inorderList.size - 1) {
            if (inorderList[i] >= inorderList[i + 1]) return false
        }

        return true
    }

    private fun inorder(root: TreeNode?, inorderList: MutableList<Int>) {
        if (root == null) return;

        inorder(root.left, inorderList)
        inorderList.add(root.`val`)
        inorder(root.right, inorderList)
    }
}