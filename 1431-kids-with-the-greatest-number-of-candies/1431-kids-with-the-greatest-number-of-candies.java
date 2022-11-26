class Solution {
    public boolean hasmore(int[] candies,int cand){
        for(int i=0;i<candies.length;i++){
            if(cand<candies[i]){
                return false;
            }
        }
        return true;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(hasmore(candies,candies[i]+extraCandies)){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}