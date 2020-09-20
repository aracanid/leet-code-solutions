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
    fun reverseList(head: ListNode?): ListNode? {
        val stack = ArrayDeque<Int>()
        var currentNode = head

        while (currentNode != null) {
            stack.push(currentNode.`val`)
            currentNode = currentNode.next
        }

        if (stack.peek() == null) return null

        val newHead = ListNode(stack.pop())
        var nextNode = newHead

        while(stack.peek() != null) {
            nextNode.next = ListNode(stack.pop())
            nextNode = nextNode.next
        }

        return newHead
    }
}