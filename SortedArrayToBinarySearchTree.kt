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
    var nums = intArrayOf()

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        this.nums = nums
        return insertToTree(0, nums.size - 1)
    }

    fun insertToTree(leftIndex: Int, rightIndex: Int): TreeNode? {
        if (leftIndex > rightIndex) return null

        val pivot = ((leftIndex + rightIndex) / 2)

        val node = TreeNode(nums[pivot])
        node.left = insertToTree(leftIndex, pivot - 1)
        node.right = insertToTree(pivot + 1, rightIndex)
        return node
    }
}