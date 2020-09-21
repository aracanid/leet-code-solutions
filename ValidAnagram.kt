class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val lookupS = HashMap<Char, Int>()
        val lookupT = HashMap<Char, Int>()
        val isAnagram = true

        for (i in 0 until s.size) {
            if (lookupS.contains(letter)) {
                lookupS.get(letter)?.let {
                    lookupS.put(letter, it++)
                }
            } else {
                lookupS.put(letter, 1)
            }
        }

        for (j in 0 until t.size) {
            if (lookupT.contains(letter)) {
                lookupT.get(letter)?.let {
                    lookupT.put(letter, it++)
                }
            } else {
                lookupT.put(letter, 1)
            }
        }

        for (i in 0 until s.size) {
            if (lookupS.get(letter) != lookupT.get(letter)) {
                isAnagram = false
            }
        }

        return isAnagram
    }
}