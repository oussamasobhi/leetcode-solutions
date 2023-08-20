class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
       int paperTime=0;
       int metalTime=0;
       int glassTime=0;
       // save the last seen index of the garbage (last house)
       int lastseenpaper=0;
       int lastseenmetal=0;
       int lastseenglass=0;
       // keep tracking the existence of garbage in the upcoming houses to decide where to continue or not
       boolean keeppaper=false;
       boolean keepmetal=false;
       boolean keepglass=false;
       for(int i=0;i<garbage.length;i++){
           // PAPER
           if(garbage[i].contains("P"))
              {
              keeppaper=true;
              int sum= numberofgarbagetype(garbage[i],'P'); 
               paperTime+=sum;
              lastseenpaper=i;  
              }
              else{
                  keeppaper=false;
              }
                if(i!=garbage.length-1) paperTime+=travel[i];
          // METAL
            if(garbage[i].contains("M"))
              {
              keepmetal=true;  
            int sum= numberofgarbagetype(garbage[i],'M'); 
               metalTime+=sum;
              lastseenmetal=i;  
              }
              else{
                  keepmetal=false;
              }
                if(i!=garbage.length-1) metalTime+=travel[i];    

        // GLASS
          if(garbage[i].contains("G"))
              {
              keepglass=true;  
                int sum= numberofgarbagetype(garbage[i],'G');
               glassTime+=sum;
              lastseenglass=i;  
              }
              else{
                  keepglass=false;
              }
                if(i!=garbage.length-1) glassTime+=travel[i];    

       }
       if(!keeppaper && lastseenpaper!=-1){ 
           for(int i=lastseenpaper;i<travel.length;i++){
               paperTime-=travel[i];
           }    
       }
        if(!keepmetal && lastseenmetal!=-1){ 
           for(int i=lastseenmetal;i<travel.length;i++){
               metalTime-=travel[i];
           }    
       }
        if(!keepglass && lastseenglass!=-1){ 
           for(int i=lastseenglass;i<travel.length;i++){
               glassTime-=travel[i];
           }    
       }
       return metalTime+paperTime+glassTime;
    }
    // count the number of characters in a given string
    public int numberofgarbagetype(String garbage,char c){
          int sum=0;
          for(int i=0;i<garbage.length();i++){
              if(garbage.charAt(i)==c)
              sum++;
          }
          return sum;
    }
}