import java.util.ArrayList;
// FIND MAX STORE WATER IN ARRAYLIST . BRUTE FORCE 

public class ArrayList2 {

     
     // SOLUTION =1. METHODE FOR SOLVE WATER(LENIAR SEARCH) WITH 2..POINTER APPRO.. TIME COMLEXITY O(N).
     public static int solveWater(ArrayList<Integer> HEIGHT){
         
        int maxWater= 0;
        
          int lp=0;
         int rp= HEIGHT.size()-1;

         while (lp<rp) {
            //CLACULATE WATER AREA
            int ht= Math.min(HEIGHT.get(lp), HEIGHT.get(rp));
            int width= rp -lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);

            //ubdate ptr
            if (HEIGHT.get(lp)<HEIGHT.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
         }
         return maxWater;
     }





          // SOLUTION =2. METHODE FOR SOLVE WATER(BRUTE FORCE) TIME COMLEXITY O(N .SQAR).

    public static int SolveWater(ArrayList<Integer> Height){
        int maxWater = 0;
          //NESTED LOOP
        for(int i=0; i<Height.size(); i++){
            for(int j=i+1; j<Height.size(); j++){
                int ht= Math.min(Height.get(i),Height.get(j)); // TO CHOSE MIN. HEIGHT
                 // TO FIND WIDTH SUBTRACTING USING INDEX NO OF ELEMENTS

                int width= j-i;

                 // CALCULATE CUURENT WATER

                int currWater= ht*width;

                // CHOSE THE MAX WATER

                maxWater=Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
public static void main(String[] args) {
    ArrayList<Integer> Height = new ArrayList<>();
    Height.add(1);
    Height.add(8);
    Height.add(6);
    Height.add(2);
    Height.add(5);
    Height.add(4);
    Height.add(8);
    Height.add(3);
    Height.add(7);

    //PRINT OUTPUT
    System.out.println(solveWater(Height)); //METHODE CALL FOR 1 SOLUTION.
    System.out.println(SolveWater(Height)); //METHODE CALL FOR 2 SOLOTION
}
    
}