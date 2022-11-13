class Solution {
    public boolean isIsomorphic(String a, String b) {
      Map<Character, Integer> map1 = new HashMap<>();
     Map<Character, Integer> map2 = new HashMap<>();

     for(Integer i = 0; i <a.length(); i ++) {
         if(map1.put(a.charAt(i), i) != map2.put(b.charAt(i), i))
         return false;
     }
        return true;
    }
}