class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        String m=String.valueOf(n);
        for(int i=0;i<m.length();i++){
            pro*=Integer.parseInt(String.valueOf(m.charAt(i)));
            sum+=Integer.parseInt(String.valueOf(m.charAt(i)));
        }
        return pro-sum;
    }
}