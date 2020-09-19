/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2
        var returnNodeRoot: ListNode = ListNode(0)
        var currentNewNode: ListNode = returnNodeRoot
        var carry = 0

        while(node1 != null || node2 != null) {
            val x = if (node1 != null) node1.`val` else 0
            val y = if (node2 != null) node2.`val` else 0
            val sum = x + y + carry
            carry = sum / 10
            val value = sum % 10
            currentNewNode.next = ListNode(value)
            currentNewNode = currentNewNode.next
            node1 = node1?.next
            node2 = node2?.next
        }

        if(carry > 0) {
            currentNewNode.next = ListNode(carry)
        }

        return returnNodeRoot.next
    }
}