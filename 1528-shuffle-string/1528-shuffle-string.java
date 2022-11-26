class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder b=new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            
        b.setCharAt(indices[i],s.charAt(i));
        }
        return b.toString();
    }
}