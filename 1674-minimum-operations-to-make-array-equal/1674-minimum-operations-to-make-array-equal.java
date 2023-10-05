class Solution {
    public int minOperations(int n) {
        // 2 cases
        // 1st : arr odd length
        int ans=0;
        int i=n-1;
        if(n%2!=0){
            while(i>n/2){
            ans+=((2*i)+1)-((2*(n/2))+1);
            i--;
            }
        }
        else{
             while(i>(n/2)-1){
            ans+=((2*i)+1)-(((2*(n/2))+1)+(2*((n/2)-1)+1))/2;
            i--;
            }
        }
        return ans; 
    }
}