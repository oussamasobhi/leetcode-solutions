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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
         int max=findmax(nums);
         int index=findindex(nums,max);
         TreeNode root=new TreeNode(max);
        int[] prefix=Arrays.copyOfRange(nums,0,index);
        int[] suffix=Arrays.copyOfRange(nums,index+1,nums.length);
        getTheTreePrefix(prefix,root);
        getTheTreeSuffix(suffix,root);
        
        return root;
    }
     public void getTheTreePrefix(int[] arr,TreeNode root){
        int max=findmax(arr);
        if(max==-1) return ;
        int index=findindex(arr,max);
        TreeNode node=new TreeNode(max);
        root.left=node;
        int[] prefix=Arrays.copyOfRange(arr,0,index);
        int[] suffix=Arrays.copyOfRange(arr,index+1,arr.length);
         getTheTreePrefix(prefix,node);
         getTheTreeSuffix(suffix,node);
     }
      public void getTheTreeSuffix(int[] arr,TreeNode root){
        int max=findmax(arr);
        if(max==-1) return ;
        int index=findindex(arr,max);
        TreeNode node=new TreeNode(max);
        root.right=node;
        int[] prefix=Arrays.copyOfRange(arr,0,index);
        int[] suffix=Arrays.copyOfRange(arr,index+1,arr.length);
         getTheTreePrefix(prefix,node);
         getTheTreeSuffix(suffix,node);
     }
    public int findmax(int[] nums){
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
            max=nums[i];
        }
        return max;
    }
    public int findindex(int[] nums,int max){
        for(int i=0;i<nums.length;i++)
          {
              if(nums[i]==max)
              return i;
          }
          return -1;
    }
  
}