internal class Solution {
    fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> { /*
        Simple Math equation Solving
        two equations:
        1) 4x+2y=T
        2) 1x+1y=C
        Solving the above equations we get x = (T-2C)/2 and y = (4C-T)/2
        if they are not divisible by 2 or they are less than 0, return emtpty list
        else return them
        */
        val jumbo = tomatoSlices - 2 * cheeseSlices
        val small = 4 * cheeseSlices - tomatoSlices
        return if (jumbo % 2 != 0 || small % 2 != 0 || jumbo < 0 || small < 0) {
            ArrayList()
        } else arrayListOf(jumbo / 2, small / 2)
    }
}