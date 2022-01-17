import DynamicPrograming.longestSubSequence

object DynamicPrograming {
    fun longestSubSequence(arr: MutableList<Int>): Int {
        var max = 0
        return if (arr.size == 1) 1
        else {
            val result = mutableListOf<Pair<Int, Int>>(Pair(1, arr[0]))
            for (i in 1 until arr.size) {
                val maxOfSub = result.filter { it.second < arr[i] }.map { it.first }.max() ?: 0
                val max = maxOf(maxOfSub + 1, 1)
                result.add(Pair(max, arr[i]))
            }
            return result.map { it.first }.max()!!
        }
    }
}

fun main() {
    val data = mutableListOf(1, 2, 1, 2, 3, 4, 1, 2, 3, 1)
    print(data.toMutableList().subList(0, data.size - 1))
    print(longestSubSequence(data))
}

