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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var resultList = mutableListOf<Int>()

        inorder(root, resultList)
        return resultList
    }

    private fun inorder(root: TreeNode?, resultList: MutableList<Int>) {
        if (root == null) return

        inorder(root.left, resultList)
        resultList.add(root.`val`)
        inorder(root.right, resultList)
    }
}
