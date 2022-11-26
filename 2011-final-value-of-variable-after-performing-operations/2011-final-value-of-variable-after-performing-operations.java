class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int cum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
               
                cum=cum-1;
            }
            else{
              
                cum=cum+1;
            }
            
        }
        return cum;
    }
}