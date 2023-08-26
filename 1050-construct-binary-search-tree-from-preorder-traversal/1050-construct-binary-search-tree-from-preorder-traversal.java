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
    public TreeNode bstFromPreorder(int[] preorder) {
      TreeNode root=new TreeNode(preorder[0]);
      for(int i=1;i<preorder.length;i++){
          insert(root,preorder[i]);
      }
      return root;
    }
    public TreeNode insert(TreeNode root,int number){
       
       if(root==null){
           TreeNode node=new TreeNode(number);
           return node;
       }
       else if(root.val<number){
        root.right=insert(root.right,number);
       }
       else{
        root.left=insert(root.left,number);
       }
       return root;
    }
}