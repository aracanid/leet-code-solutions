class Solution {
    val lookup = HashMap<Int, Int>()
    fun singleNumber(nums: IntArray): Int {
        nums.forEach {
            val numberOfOccurances = if (lookup.contains(it)) 2 else 1
            lookup.put(it, numberOfOccurances)
        }

        nums.forEach {
            val numberOfOccurances = lookup.get(it)
            if (numberOfOccurances != null && numberOfOccurances < 2) return it
        }
        return -1
    }
}