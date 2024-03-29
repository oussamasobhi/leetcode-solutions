class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
          if(map.containsKey(logs[i][0])){
              map.get(logs[i][0]).add(logs[i][1]);
          }
            else{
                map.put(logs[i][0],new HashSet<Integer>());
                map.get(logs[i][0]).add(logs[i][1]);
                
            }
        }
        int[] answers=new int[k];
        for(Map.Entry m : map.entrySet()){   
        
            
            answers[((HashSet<Integer>)m.getValue()).size()-1]+=1;    
   }  
        return answers;
    }
}