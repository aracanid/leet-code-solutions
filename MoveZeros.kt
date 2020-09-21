
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var nonZeroIndex = 0
        for(i in 0 until nums.size) {
            val current = nums[i]
            if(current != 0) {
                nums[nonZeroIndex++] = current
            }
        }

        for(i in nonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }
}