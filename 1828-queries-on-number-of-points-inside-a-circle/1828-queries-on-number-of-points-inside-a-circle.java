class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answers=new int[queries.length];
       
        for(int i=0;i<queries.length;i++){
            
            for(int j=0;j<points.length;j++){
              //  System.out.println(j);
    if(Math.pow(points[j][0]-queries[i][0],2)+Math.pow(points[j][1]-queries[i][1],2)<=Math.pow(queries[i][2],2))
        answers[i]++;
                
                 
            }
        }
        return answers;
    }
}