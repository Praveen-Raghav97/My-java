    //FIND N QUEEN PROBLEM OF N*N MATRIX----

    public class NQueenProblem {

    


    //TO CHECK THE POSITION IS SAFE OR NOT---
    public static boolean isSafe(char board [][],int row , int col){
        //For vertical Up
        for(int i=row-1; i>=0; i--){
            if (board[i][col] =='Q') {
                return false;
                
            }
        }
        //For Left Diagonal Up
        for(int i=row-1,j=col-1; i>=0 && j>=0 ; i-- ,j--){  
            if (board[i][j] =='Q') {
            return false;
            
        }


        }
        //For Right Diagonal UP
        for(int i= row-1, j=col+1 ;i>=0 && j<board.length; i--, j++){
            if (board[i][j]=='Q') {
                return false;
                
            }
        }
         return true;
    }

    // TO FIND N QUEENS ---

    public static void nqueens(char board[][],int row){
        //Base Case
        if (row == board.length) {
            Printboard(board);
            return;
            
        }
        //Column
        for (int j=0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
              board[row][j] ='Q'; 
              nqueens(board, row+1); 
              board[row][j]= 'x';
            }
            
        }

    }

    //PRINT THE BOARD-----
    public static void Printboard( char board[][]){
        System.out.println("-------print chess board--------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            
        }
    }
// MAIN METHODE---
  public static void main(String[] args) {
    int n=4;
    char board [][] = new char[n][n];
    //Initialize
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
           board[i][j] = 'x';
        }
    }
    nqueens(board,0);
  }  
}
