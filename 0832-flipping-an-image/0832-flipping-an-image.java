class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] pic=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                pic[i][j]=image[i][image[i].length-j-1];
                 pic[i][j]=(pic[i][j]==1)?0: 1;
            }
        }
        return pic;
    }
}