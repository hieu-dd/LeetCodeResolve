fun singleNumber(nums: IntArray): Int {
    var a = 0
    for (i in nums.indices) {
        a = a.xor(nums[i])
    }
    return a
}
