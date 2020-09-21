class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val sortedS = s.toCharArray().sort()
        val sortedT = t.toCharArray().sort()

        return sortedS.equals(sortedT)
    }
}