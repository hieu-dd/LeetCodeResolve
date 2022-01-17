import java.lang.Integer.MAX_VALUE
import java.lang.Integer.MIN_VALUE
import kotlin.math.pow

/*
    https://leetcode.com/problems/string-to-integer-atoi/
*/


fun myAtoi(s: String): Int {
    var arr = s.trim().toCharArray().map { it.toString() }.toMutableList()
    var result = mutableListOf<String>()
    var isEvent = false
    if (arr.isEmpty()) {
        return 0
    } else if (arr[0] == "-") {
        isEvent = true
        arr.removeAt(0)
    } else if (arr[0] == "+") {
        isEvent = false
        arr.removeAt(0)
    }
    while (arr.isNotEmpty() && arr[0].toIntOrNull() != null) {
        if (arr[0] != "0" || result.any { it != "0" }) {
            result.add(arr[0])
        }
        arr.removeAt(0)
    }
    var r = 0L
    if (result.size > 10) {
        return if (isEvent) Int.MIN_VALUE
        else Int.MAX_VALUE
    }

    result.forEachIndexed { index, s ->
        r += s.toLong() * 10.0.pow(result.lastIndex - index).toLong()
    }
    print(r)
    r *= if (isEvent) -1 else 1
    return if (r > MAX_VALUE) {
        Int.MAX_VALUE
    } else if (r < MIN_VALUE) {
        Int.MIN_VALUE
    } else r.toInt()
}

fun main() {
    print(myAtoi("20000000000000000000"))
}


