class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val output = mutableListOf<String>()

        for (i in 1 until n + 1) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                output.add("FizzBuzz")
            } else if (i % 3 == 0) {
                output.add("Fizz")
            } else if (i % 5 == 0) {
                output.add("Buzz")
            } else {
                output.add(i.toString())
            }
        }

        return output.toList()
    }
}