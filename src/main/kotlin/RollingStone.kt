fun solution(stone: MutableList<MutableList<Int>>, nSteep: Int): MutableList<MutableList<Int>> {
    var result = stone
    for (i in 0..nSteep - 1) {
        result = rollOne(result)
    }
    return result
}

fun rollOne(stone: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    stone.firstOrNull()?.let {
        for (i in it.indices) {
            val row = mutableListOf<Int>()
            for (j in stone.size-1 downTo 0) {
                row.add(stone[j][i])
            }
            result.add(row)
        }
    }
    return result
}

fun main() {
    val stone = mutableListOf(
        mutableListOf(1, 2, 3, 4),
        mutableListOf(1, 2, 3, 4),
        mutableListOf(1, 2, 3, 4),
    )
    val stone1 = mutableListOf(
        mutableListOf(1, 2),
        mutableListOf(3, 4),
    )
    print(solution(stone1, 1))
}