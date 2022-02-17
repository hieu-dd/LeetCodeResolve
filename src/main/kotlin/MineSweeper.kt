fun solution(mine: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val result = mutableListOf<MutableList<Int>>()
    val rows = mine.size
    val cols = mine.firstOrNull()?.size?:0
    for(j in 0..rows-1){
        val row = mutableListOf<Int>()
        for(i in 0..cols-1){
            row.add(findNear(mine,j,i))
        }
        result.add(row)
    }
    return result
}

fun findNear(mine: MutableList<MutableList<Int>>, i: Int, j: Int): Int {
    return try {
        mine[i - 1][j - 1]
    } catch (e: Exception) {
        0
    } + try {
        mine[i - 1][j]
    } catch (e: Exception) {
        0
    } + try {
        mine[i - 1][j + 1]
    } catch (e: Exception) {
        0
    } + try {
        mine[i][j - 1]
    } catch (e: Exception) {
        0
    } + try {
        mine[i][j + 1]
    } catch (e: Exception) {
        0
    } + try {
        mine[i + 1][j - 1]
    } catch (e: Exception) {
        0
    } + try {
        mine[i + 1][j]
    } catch (e: Exception) {
        0
    } + try {
        mine[i + 1][j + 1]
    } catch (e: Exception) {
        0
    }
}

fun main() {
    val mine = mutableListOf(mutableListOf(1,0,0), mutableListOf(1,1,1))
    print(solution(mine))
}