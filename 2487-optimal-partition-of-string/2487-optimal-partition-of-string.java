class Solution {
    public int partitionString(String s) {
        int ans=1;
        ArrayList<Character> listy=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(listy.contains(s.charAt(i))){
                ans++;
                listy.clear();
               // str=s.substring(i,i+1);
            }
            listy.add(s.charAt(i));
                //str+=s.substring(i,i+1);
        }
        return ans;
    }
}