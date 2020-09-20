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
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if(t1 == null) return t2
        if(t2 == null) return t1

        val newNode = TreeNode(t1?.`val` + t2.`val`)
        newNode.left = mergeTrees(t1?.left, t2?.left)
        newNode.right = mergeTrees(t1?.right, t2?.right)

        return newNode
    }
}