fun removeDuplicates(nums: IntArray): Int {
    return nums.distinct().size
}

fun main(){
    print(removeDuplicates(intArrayOf(1,1,2)))
}