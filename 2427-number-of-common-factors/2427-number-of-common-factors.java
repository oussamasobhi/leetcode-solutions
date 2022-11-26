class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int c=(a<b)?a:b;
        for(int i=1;i<c+1;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}