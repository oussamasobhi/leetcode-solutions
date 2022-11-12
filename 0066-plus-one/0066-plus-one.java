class Solution {
    public int[] plusOne(int[] digits) {
      int[] arr=new int[digits.length];
      int index=digits.length-1;
        boolean add=false;
       
            if(digits[index]+1>9){
                arr[index]=0;
                index--;
                add=true;
            }
            else{
                arr[index]=digits[index]+1;
                index--;
                add=false;
            }
           while(index>-1){
            
               if(add){
                   if(digits[index]+1>9){
                       arr[index]=0;
                       index--;
                       add=true;
                   }
                   else{
                      
                       arr[index]=digits[index]+1;
                       index--;
                       add=false;
                        
                   }
               }
               else{
                   arr[index]=digits[index];
                   index--;
                   add=false;
               }
                
        }
         if(add){
        List<Integer> intList = new ArrayList<Integer>(arr.length);
for (int i : arr)
{
    intList.add(i);
}
       
        intList.add(0,1);
         
      int[] ar = intList.stream().mapToInt(i -> i).toArray();
             return ar;
         }
             return arr;
    }
}