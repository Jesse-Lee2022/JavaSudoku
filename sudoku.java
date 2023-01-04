public class sudoku {
  static int uGrid[][]=new int[][]
         {{1,5,2,4,8,9,3,7,6},
         {7,3,9,2,5,6,8,4,1},
         {4,6,8,3,7,1,2,9,5},
         {3,8,7,1,2,4,6,5,9},
         {5,9,1,7,6,3,4,2,8},
         {2,4,6,8,9,5,7,1,3},
         {9,1,4,6,3,7,5,8,2},
         {6,2,5,9,4,8,1,3,7},
         {8,7,3,5,1,2,9,6,4}};
  static int grid[][]=new int[9][9];
  static boolean bool[][] = new boolean[][]
        {{true,false,false,true,true,true,false,false,true},
        {true,true,false,false,false,false,false,true,false},
        {false,false,false,false,false,true,true,true,true},
        {false,false,true,true,true,false,true,false,false},
        {true,false,false,true,false,true,false,false,true},
        {false,false,true,false,true,true,true,false,false},
        {true,true,true,true,false,false,false,false,false},
        {false,true,false,false,false,false,false,true,true},
        {true,false,false,true,true,true,false,false,true}};
      
  public static void main(String[] args) {
      for (int i=0;i<9;i++) {
          for (int j=0;j<9;j++) {
            if (bool[i][j]==true){
              grid[i][j]=uGrid[i][j];
              System.out.print(grid[i][j]+"|");  
            }else{
              grid[i][j]= 0;
              System.out.print(" |");  
            }
            
          }
          System.out.println();
      }
  }

}