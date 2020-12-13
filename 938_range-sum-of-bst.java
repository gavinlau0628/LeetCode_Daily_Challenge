/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int sum;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        return sum;
    }
    
    private void dfs(TreeNode root, int low, int high) {
        if (root == null) return;
        
        if (low <= root.val && root.val <= high) sum += root.val;
        
        /* Only process to the reminaing of the tree
           if the val of the root is bewteen low & high
           
           else it's meaningless to go through all nodes
        */
        if (low < root.val) dfs(root.left, low, high);
        if (high > root.val) dfs (root.right, low, high);
    }
}
