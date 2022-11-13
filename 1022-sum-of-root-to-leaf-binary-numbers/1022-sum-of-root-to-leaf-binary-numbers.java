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

    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        
        if(root.left!=null){
            root.left.val=root.val*2+root.left.val;
            sumRootToLeaf(root.left);
        }
      
        if(root.right!=null){
            root.right.val=root.val*2+root.right.val;
            sumRootToLeaf(root.right);
        }
       if(root.right==null && root.left==null)
          sum+=root.val;
        return sum;
    }
}