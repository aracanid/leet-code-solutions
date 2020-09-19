class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var lookup = HashMap<Char, Char>()
        var biggestSize = 0

        var i = 0
        var j = 0

        while(i < s.length && j < s.length) {
            if (!lookup.contains(s[j])) {
                lookup.put(s[j],s[j])
                j++
                biggestSize = maxOf(biggestSize, j - i)
            } else {
                lookup.remove(s[i])
                i++
            }
        }

        return biggestSize
    }
}