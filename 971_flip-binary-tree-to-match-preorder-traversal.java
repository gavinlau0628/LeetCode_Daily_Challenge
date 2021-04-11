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
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> list = new LinkedList<>();
        return backtrack(root,voyage,list,0) != -1? list : Arrays.asList(-1);
    }
    private int backtrack(TreeNode root,int[] voyage, List<Integer> list,int level){
        if(level == -1) return -1;
        if(root == null) return level;
        if(root.val != voyage[level]) return -1;
        level++;
        if(root.left != null && root.left.val != voyage[level] && root.right != null && root.right.val == voyage[level]){
            list.add(root.val);
            int index = backtrack(root.right,voyage,list,level);
            return backtrack(root.left,voyage,list,index);
        }
        int index = backtrack(root.left,voyage,list,level);
        return backtrack(root.right,voyage,list,index);
    }
}
