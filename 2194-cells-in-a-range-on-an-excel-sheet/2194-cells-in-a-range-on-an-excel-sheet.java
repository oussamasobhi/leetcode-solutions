class Solution {
    public List<String> cellsInRange(String s) {
        List<String> arr=new ArrayList<>();
      String a=s.substring(0,2);
        String b=s.substring(3,5);
        int start=Character.getNumericValue(a.charAt(1));
        int end=Character.getNumericValue(b.charAt(1));
for(int j=(int)a.charAt(0);j<(int)b.charAt(0)+1;j++){
     for(int i=start;i<end+1;i++){
         System.out.println(i);
               arr.add((char)j+""+i);
     }
}
        return arr;
    }
}