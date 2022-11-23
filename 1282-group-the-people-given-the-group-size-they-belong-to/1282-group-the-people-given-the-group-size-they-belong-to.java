class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
     for(int i=0;i<groupSizes.length;i++){
         if(map.containsKey(groupSizes[i])){
             List<Integer> tmp=map.get(groupSizes[i]);
             tmp.add(i);
             map.put(groupSizes[i],tmp);
         }
         else{
             List tmp=new ArrayList<>();
             tmp.add(i);
             map.put(groupSizes[i],tmp);
         }
     } 
    List<List<Integer>> arr=new ArrayList<>();
         for(Map.Entry m : map.entrySet()){    
             if(((List<Integer>)m.getValue()).size()>(int)m.getKey()){
                 int j=((List<Integer>)m.getValue()).size()/(int)m.getKey();
                 int k=0;
                 while(j>0){
                     
                 List<Integer> tmp=new ArrayList<>();
                 for(int i=k;i<k+(int)m.getKey();i++){
                     tmp.add(((List<Integer>)m.getValue()).get(i));
                 }
                  k+=(int)m.getKey();   
                 arr.add(tmp);
                     j--;
                 }
             }
           else {
               arr.add((List<Integer>)m.getValue());
           }
   }
        return arr;
    }
}