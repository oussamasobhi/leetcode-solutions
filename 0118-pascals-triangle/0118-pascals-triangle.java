class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> ar=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            Integer[] a=new Integer[i+1];
            List<Integer> tmp=new ArrayList<Integer>( Arrays.asList(a));
          
            tmp.set(0,1);
            if(i!=0)
            tmp.set(i,1);
            for(int j=1;j<i;j++){
               
                tmp.set(j,ar.get(i-1).get(j)+ar.get(i-1).get(j-1));
                
            }
           
                        ar.add(tmp);
        }
        return ar;
    }
}