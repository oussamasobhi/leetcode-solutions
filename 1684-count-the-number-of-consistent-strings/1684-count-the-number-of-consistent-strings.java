class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      // not my idea
        boolean[] allowedArr = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            allowedArr[allowed.charAt(i)-'a'] = true;
        }        
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wi = 0;
            while (wi < word.length()) {
                char c = word.charAt(wi);
                if (!allowedArr[c-'a']) break;
                wi++;
            }
            
            
            if (wi >= word.length()) count++;
        }
        
        return count;
    }
}