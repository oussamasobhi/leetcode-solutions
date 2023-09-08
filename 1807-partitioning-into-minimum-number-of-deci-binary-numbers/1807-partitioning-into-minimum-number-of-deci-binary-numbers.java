class Solution {
    public int minPartitions(String n) {
       String ans="-1";
       for(int i=0;i<n.length();i++){
           if(Integer.parseInt(ans)<Integer.parseInt(n.charAt(i)+""))
              ans=n.charAt(i)+"";
       }
       return Integer.parseInt(ans);
    }
}