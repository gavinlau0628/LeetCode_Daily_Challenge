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
//recursion:

    public TreeNode searchBST(TreeNode root, int val) {
            if(root == null) return root;
            if(root.val == val){
                return root;
            }
            else{
                return val<root.val? searchBST(root.left,val):searchBST(root.right,val);
            }
        }
}
    
/*
//iteration:

    public TreeNode searchBST(TreeNode root, int val) {
            while(root != null && root.val != val){
                root = val<root.val? root.left:root.right;
            }
            return root;
        }
}
*/
