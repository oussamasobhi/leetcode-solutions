class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=1;
        int cap=capacity;
        for(int i=0;i<plants.length-1;i++){
            cap-=plants[i];
            steps++;
            if(cap>=plants[i+1]){
                
                continue;
            }
            else{
                cap=capacity;
                steps+=2*(i+1);
            }
           
        }
        
        return steps;
    }
}