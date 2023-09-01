class Solution {
    public int maxCoins(int[] piles) {
        int mycoins=0;
        Arrays.sort(piles);
        int n=piles.length/3;
        int i=piles.length-2;
        while(n>0){
          System.out.println("--");
          mycoins+=piles[i];
          i-=2;
          n--;
        }
        return mycoins;
    }
}