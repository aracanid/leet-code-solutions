class Solution {
    fun reverseString(s: CharArray): Unit {

        var front = 0
        var end = s.size - 1

        while(front != end && (front != s.size / 2)) {
            val frontSwap = s[front]
            val endSwap = s[end]

            s[front] = endSwap
            s[end] = frontSwap

            front++
            end--
        }
    }
}