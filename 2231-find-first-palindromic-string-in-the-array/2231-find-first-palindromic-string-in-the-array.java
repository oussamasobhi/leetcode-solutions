class Solution {
    public String firstPalindrome(String[] words) {
        boolean ispal=false;
        for(int i=0;i<words.length;i++){
            ispal=false;
            for(int j=0;j<words[i].length();j++){
                if(Objects.equals(words[i].charAt(j),words[i].charAt(words[i].length()-j-1)))
                  {
                      ispal=true;
                  }
                else
                  {
                      ispal=false;
                      break;
                  }
            }
            if(ispal)
               return words[i];
        }
        return "";
    }
}