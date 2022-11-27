class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,visited,word,0))
                    return true;
                
                }
            }
        }
   
        return false;
    }
    boolean dfs(char[][] grid, int i, int j, boolean[][] visited,String w,int index) {
    if ((i < 0 || i >= grid.length)   ||   (j < 0 || j >= grid[0].length)  ||   grid[i][j] != w.charAt(index)) 
        return false;
    
        
   if(visited[i][j] ){ return false; }                                             
	if(index == w.length() - 1){ return true; }
	visited[i][j] = true; 
   
  if(dfs(grid, i, j - 1, visited,w,index+1)){return true;}
  if(dfs(grid, i, j + 1, visited,w,index+1)){return true;}
   if( dfs(grid, i - 1, j, visited,w,index+1)){return true;} 
  if( dfs(grid, i + 1, j, visited,w,index+1)){return true;}
  
   
        visited[i][j] = false;
        return false;
}
}