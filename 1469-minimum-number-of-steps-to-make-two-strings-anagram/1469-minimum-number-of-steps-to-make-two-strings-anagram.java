class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        int ans=0;
        for(int i:arr)
          if(i>0) ans+=i;
          
          return ans;
    }
}