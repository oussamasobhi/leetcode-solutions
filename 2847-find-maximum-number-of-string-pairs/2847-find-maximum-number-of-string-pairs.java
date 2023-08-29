class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
       for(int i=0;i<words.length-1;i++){
          for(int j=i+1;j<words.length;j++){
              if(words[i].length()!=words[j].length())
                continue;
                else{
                    if(checkPair(words[i],words[j]))
                      count++;
                }
          }
       }   
       return count;
    }
    public boolean checkPair(String s1,String s2){
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(n-i-1))
              return false;
        }
        return true;
    }
}