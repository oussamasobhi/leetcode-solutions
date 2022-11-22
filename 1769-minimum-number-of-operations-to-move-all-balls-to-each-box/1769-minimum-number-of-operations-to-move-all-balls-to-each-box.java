class Solution {
    public int[] minOperations(String boxes) {
           int[] answers =new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int count=0;
            for(int k=0;k<boxes.length();k++){
                if(boxes.charAt(k)=='1' && k!=i){
                    count+=Math.abs(i-k);
                }
            }
            answers[i]=count;
        }
        return answers;
    }
}