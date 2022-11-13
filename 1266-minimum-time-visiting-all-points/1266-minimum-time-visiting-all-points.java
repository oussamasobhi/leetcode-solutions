class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
    for(int i=0;i<points.length-1;i++){
     
    int[] arr={Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1])};
     sum+=(arr[0]==arr[1])?(arr[0]):(Math.abs(arr[0]-arr[1])+Math.min(arr[0],arr[1]))  ;
     
      }
        return sum;
    }
}