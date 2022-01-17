import model.TreeNode

fun isValidBST(root: TreeNode?): Boolean {
    val listNode = mutableListOf<TreeNode>()
    if (root == null) return true;
    addNodeInOrder(root, listNode)
    for (i in 0 until listNode.size - 1) {
        if (listNode[i].`val` >= listNode[i + 1].`val`) return false
    }
    return true
}

fun addNodeInOrder(root: TreeNode, listNode: MutableList<TreeNode>) {
    root.left?.let {
        addNodeInOrder(it, listNode)
    }
    listNode.add(root)
    root.right?.let {
        addNodeInOrder(it, listNode)
    }
}

fun main() {
    val root = TreeNode(5);
    root.left = TreeNode(1)
    root.right = TreeNode(4).apply {
        left = TreeNode(3)
        right = TreeNode(6)
    }
    print(isValidBST(root))
}