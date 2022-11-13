/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy( TreeNode original,TreeNode cloned, TreeNode target) {
          if (original == null) return null; //step 1
		//Don't compare value. Compare the object
        if (original == target) return cloned;  //step 2
        TreeNode left = getTargetCopy(original.left, cloned.left, target); //step 3
		// early return if we already find it
        if (left != null) return left; //step 4
        return getTargetCopy(original.right, cloned.right, target); //step 5
      
    }
}