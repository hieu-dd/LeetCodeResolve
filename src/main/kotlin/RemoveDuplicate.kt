fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    var j = 0
    val size = nums.size
    var count = 0
    while (j < size) {
        val check = nums[j]
        j++
        while (j < size && nums[j] == check) {
            count++
            j++
        }
        if (j >= size) {
            break
        }
        nums[++i] = nums[j]
    }
    return nums.size - count
}

fun main() {
    print(removeDuplicates(intArrayOf(1, 1)))
}