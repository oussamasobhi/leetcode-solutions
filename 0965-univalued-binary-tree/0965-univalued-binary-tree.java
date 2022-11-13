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
    
    public boolean isUnivalTree(TreeNode root) {
       if(root.right!=null && root.left!=null){
           if(root.val==root.right.val && root.val==root.left.val)
               return (true && isUnivalTree(root.right) && isUnivalTree(root.left));
           else
               return false;
       }
        else if(root.right!=null){
            if(root.val==root.right.val){
                return (true && isUnivalTree(root.right));
            }
            else
                return false;
        }
        else if(root.left!=null){
             if(root.val==root.left.val){
                return (true && isUnivalTree(root.left));
            }
            else
                return false;
        }
        return true;
}
}