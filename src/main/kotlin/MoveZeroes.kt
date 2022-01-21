// https://leetcode.com/problems/move-zeroes
fun moveZeroes(nums: IntArray): Unit {
    var i = 0
    while (i < nums.size) {
        if (nums[i] == 0) {
            var j = i + 1
            while (j < nums.size && nums[j] == 0) {
                j++
            }
            if(j<nums.size){
                nums[i] = nums[j]
                nums[j] = 0
            }

        }
        i++
    }
}

fun main() {
    val list = intArrayOf(0,1,0,3,12)
    moveZeroes(list)
    print(list.toList())
}