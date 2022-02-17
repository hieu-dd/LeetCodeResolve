fun solution(password: String): Boolean {
    val special = "!@#\$%ˆ&*()"
    password.toCharArray().forEach {
        if (!it.isLetterOrDigit() && !special.contains(it)) {
            return false
        }
    }

    return password.length in 6..20
}

fun main() {
    val password: String = "12345"
    println(solution(password))
}