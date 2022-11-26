class Solution {
    public String truncateSentence(String s, int k) {
        String a="";
        Scanner sc=new Scanner(s);
        int i=0;
        while(sc.hasNext() && i<k){
            a+=sc.next();
            if(i!=k-1)
            a+=" ";
            
            i++;
        }
        return a;
    }
}