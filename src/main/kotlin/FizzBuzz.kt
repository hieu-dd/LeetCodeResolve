fun fizzBuzz(n: Int): List<String> {
    return List<String>(n) { index ->
        (index + 1).let {
            when {
                it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }
    }
}