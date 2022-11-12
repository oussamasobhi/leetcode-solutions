class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        int left=0;
        int right=s1.length()-1;
 while(left<right){
     if(Character.isLetterOrDigit(s1.charAt(left)) &&                      Character.isLetterOrDigit(s1.charAt(right)))
             {
                 if(s1.charAt(left)==s1.charAt(right)){
                   left++;
                     right--;
                     continue;
                 }
                 else 
                     return false;
             }
    else
          if (!Character.isLetterOrDigit(s1.charAt(left))){
             left++;}
         if(!Character.isLetterOrDigit(s1.charAt(right)))
            { right--;}
           
       
    }
            return true;
            }
            }
        
        
        
        
        
        
        
        
        
    /*/    for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
            s1+=s.substring(i,i+1);
        }
        
        for(int j=0;j<s1.length()/2;j++){
            if(s1.charAt(j)==s1.charAt(s1.length()-j-1))
                continue;
            else
                return false;
        }
        return true;
    }
}/*/