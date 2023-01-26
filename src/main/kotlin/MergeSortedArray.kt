fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    if (n == 0) return;
    var i = m - 1
    var j = n - 1
    while (i >= 0 || j >= 0) {
        if (i < 0) {
            nums1[i + j + 1] = nums2[j]
            j--
        } else if (j < 0) {
            nums1[i + j + 1] = nums1[i]
            i--
        } else if (nums1[i] < nums2[j]) {
            nums1[i + j + 1] = nums2[j]
            j--
        } else {
            nums1[i + j + 1] = nums1[i]
            i--
        }
    }
}

fun main() {

}