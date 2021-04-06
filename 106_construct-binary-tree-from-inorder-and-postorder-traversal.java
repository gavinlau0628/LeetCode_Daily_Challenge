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
     public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if( inorder.length == 0 ) return null;
        // last element in the postorder is the root of the tree
         TreeNode root = new TreeNode(postorder[postorder.length-1]);
         Stack<TreeNode> st = new Stack<>();
         st.push(root);
        
        for(int i=postorder.length-2, j = inorder.length-1;i>=0;--i){
            //postorder[i] is the right child till the element in inorder traversal is not equal (i.e.rightmost node)
            if( st.peek().val != inorder[j] ){
                st.push(st.peek().right = new TreeNode(postorder[i]));
            }else{
                TreeNode temp = null;
                //pop  till all the elements matching inorder elements are removed 
                while(!st.empty() && st.peek().val == inorder[j]){
                     temp = st.pop(); j--;
                }
                st.push(temp.left =  new TreeNode(postorder[i])); //continue in post-order fashion
            } 
        }
       return root;
    }
}
