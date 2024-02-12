 //----TO SOLVE THE SUDOKU PROBLEM---
public class sudoku {
    // TO CHECK THE POSISION TO SUDOKU
    public static boolean isSafe(int sudoku[][],int col,int row,int digit){
        //column
        for(int i=0; i<=8; i++){
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        //Row
        for(int j=0; j<=8; j++){
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        //Grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        //3X3 GIRD
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if (sudoku[i][j] == digit) {
                  return false;  
                }
            }
        }
        return true;
    }
    // TO SOLVE THE SUDOKU PROBLEM

    public static boolean sodokusol(int sudoku[][],int row, int col){
        //base
        if (row==9) {
           return true; 
        }
        //recursion
        int nextRow= row,nextCOl=col+1;
        if (col+1==9) {
            nextRow=row+1;
            nextCOl=0; 
        }
        if (sudoku[row][col] !=0) {
           return sodokusol(sudoku, nextRow, nextCOl) ;
        }

        for(int digit=1; digit<=9; digit++){
              if (isSafe(sudoku, col, row, digit)) {
                sudoku[row][col] = digit;
            if (sodokusol(sudoku,nextRow,nextCOl)) {
               return true; 
            }
              
             
              sudoku[row][col]=0;
        }
    }
    return false;
}  
   //PRINT THE MATRIX OF SUDOKU

    public static void print(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
            System.out.print(sudoku[i][j]+" ");
            }
         System.out.println();  
        }
       
    }
    //MAIN FUNCTION
    public static void main(String[] args) {
        int sudoku [][]={{0,0,8,0,0,0,0,0,0,},
    {4,9,0,1,5,7,0,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};

    if (sodokusol(sudoku, 0, 0)) {
        System.out.println("solution is exits");
        print(sudoku);
    }
    else{
        System.out.println("solution does not exits");
    }
    }
}
