val remember = mutableMapOf<List<Int>, Long>()

fun solution(n: Int, k: Int): Long {
    if (k < 0) return 0
    if (n == 0) return 0
    if (n == 1) {
        if (k < 10) return 1
        else return 0
    }
    if (remember[listOf(n, k)] != null) return remember[listOf(n, k)]!!
    var result = 0L
    for (i in 0..9) {
        result += solution(n - 1, k - i)
    }
    remember[listOf(n, k)] = result
    return result
}

fun main() {
    println(solution(1, 4))
    println(solution(1, 3))
    println(solution(1, 2))
    println(solution(1, 1))
    println(solution(1, 0))
    println(solution(2, 4))
    println(solution(2, 4))
}