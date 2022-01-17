import HaNoiTower.useRecursive

// https://codelearn.io/learning/data-structure-and-algorithms/896721
// Tháp Hà Nội
object HaNoiTower {
    fun useRecursive(nums: Int, from: String, inter: String, to: String) {
        if (nums == 1) {
            println("move Disk 1 from $from to $to")
        } else {
            useRecursive(nums - 1, from, to, inter)
            println("move Disk $nums from $from to $to")
            useRecursive(nums - 1, inter, from, to)
        }
    }
}

fun main() {
    useRecursive(4, "A", "B", "C")
}