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
    List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       if(root==null)
           return arr;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int qlen=q.size();
        List<Integer> b=new ArrayList<>();
       b.add(root.val);
        arr.add(b);
        while(qlen>0){
            qlen=q.size();
           
            List<Integer> tmp=new ArrayList<>();
            for(int i=0;i<qlen;i++){
                 TreeNode cur=q.poll();
                if(cur.left!=null){
                    System.out.println(cur.left.val);
                tmp.add(cur.left.val);
                q.add(cur.left);
                }
                 if(cur.right!=null){
                      System.out.println(cur.right.val);
                q.add(cur.right);
                tmp.add(cur.right.val);
               }
            }
            if(tmp.size()!=0) arr.add(tmp);
        }
        return arr;
    }
}