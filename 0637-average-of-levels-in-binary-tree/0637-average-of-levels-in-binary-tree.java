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
   
    List<Double> arr=new ArrayList<>();
   
    public List<Double> averageOfLevels(TreeNode root) {
      Queue<TreeNode> q=new LinkedList<>(List.of(root));
      while(q.size()>0){
          double qlen=q.size();
          double row=0;
          for(int i=0;i<qlen;i++){
              TreeNode cur=q.poll();
              row+=cur.val;
              if(cur.left!=null) q.offer(cur.left);
              if(cur.right!=null) q.offer(cur.right);
          }
          arr.add(row/qlen);
      }
        return arr;
    }
}