/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
   
    public int maxDepth(Node root) {
         int max=0;
        if(root==null)
            return 0;
      Queue<Node> q=new LinkedList<>();
        q.add(root);
        int qlen=1;
        while(q.size()>0){
            qlen=q.size();
            for(int i=0;i<qlen;i++){
                Node cur=q.poll();
                for(int j=0;j<cur.children.size();j++){
                    q.add(cur.children.get(j));
                }
            }
            max++;
        }
        return max;
    }
}