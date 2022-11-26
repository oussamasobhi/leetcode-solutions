class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int tot=0;
        int sum=0;
       int j=1;
        int i=0;
        while(j<=arr.length){
            for(int k=0;k<arr.length;k++){
                if(k+j>arr.length){
                  
                    break;}
            for(i=k;i<j+k;i++){
                tot+=arr[i];
              
            }
            }
           
            j=j+2;
             
        }
        return tot;
    }
}