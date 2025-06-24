package section10_binary_search_trees;

class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        // Your solution here
        return false;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
} 