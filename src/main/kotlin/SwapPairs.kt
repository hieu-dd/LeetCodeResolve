import model.ListNode
import model.print

//https://leetcode.com/problems/swap-nodes-in-pairs/submissions/

fun swapPairs(head: ListNode?): ListNode? {
    var tem = head
    while (tem?.next != null) {
        val temVal = tem.`val`
        tem.`val` = tem.next!!.`val`
        tem.next!!.`val` = temVal
        tem = tem.next!!.next
    }
    return head
}

fun main() {
    val head = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }
    }
    swapPairs(head)?.print()
}
