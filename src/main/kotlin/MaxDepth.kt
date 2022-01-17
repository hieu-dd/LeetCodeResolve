import model.TreeNode
import kotlin.math.max

fun maxDepth(root: TreeNode?): Int {
    val queue = mutableListOf<TreeNode>()
    var count = 0
    root?.let { queue.add(it) }
    while (queue.isNotEmpty()) {
        count++
        val newQueue = queue.map { it }
        queue.clear()
        queue.addAll(newQueue.flatMap { listOfNotNull(it.left, it.right) })
    }
    return count
}

fun maxDepthRecursion(node: TreeNode?): Int {
    return node?.let {
        1 + max(maxDepthRecursion(node.left), maxDepthRecursion(node.right))
    } ?: 0
}