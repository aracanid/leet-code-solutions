class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currentMax = 0
        var max = nums[0]

        nums.forEach { number ->
            currentMax = maxOf(number, number + currentMax)
            max = maxOf(max, currentMax)
        }

        return max
    }
}