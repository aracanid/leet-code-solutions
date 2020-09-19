class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var lookup = hashMapOf<Int, Int>()

        nums.forEachIndexed { index, number ->
            val compliment = target - number
            lookup.get(compliment)?.let { complimentIndex ->
                if (complimentIndex != index) {
                    return intArrayOf(complimentIndex, index)
                }
            }
            lookup.put(number, index)
        }
        return intArrayOf()
    }
}