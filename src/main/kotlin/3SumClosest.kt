// https://leetcode.com/problems/3sum-closest/submissions/
fun threeSumClosest(nums: IntArray, target: Int): Int {
    var distance = 10000
    var result = 0
    nums.sort()
    for (i in 0..nums.size - 3) {
        var i1 = i + 1
        var i2 = nums.size - 1
        while (i1 < i2) {
            val sum = nums[i] + nums[i1] + nums[i2]
            if (distance >= Math.abs(target - sum)) {
                distance = Math.abs(target - sum)
                result = sum
            }
            if (sum > target) {
                i2--
            } else {
                i1++
            }
        }
    }
    return result

}

fun main() {
    print(threeSumClosest(intArrayOf(1, 2, 4, 8, 16, 32, 64, 128), 82))
}