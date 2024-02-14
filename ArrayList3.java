import java.util.ArrayList;
public class ArrayList3 {

 // SOLUTION.1 FIND ONE PAIR OF SUM BRUTE FORCE O(N.SQR)
    public static boolean pairSum1( ArrayList<Integer> pair, int target){

        for(int i=0; i<pair.size(); i++){
        for(int j= i+1; i<pair.size(); j++){

         if (pair.get(i) + pair.get(j) == target) {
            return true;
         }
        }

    }

    return false;
    }

    //  SOLUTION.2 FIND   THE ONE PAIR OF SUM LINEAR SEARCH .O(N).
    public static boolean pairSum2(ArrayList<Integer> pair, int target){
         
        int lp= 0;
        int rp= pair.size()-1;

        while (lp!=rp) {
             //Case.1
            if (pair.get(lp)+ pair.get(rp)== target) {
                return true;
            }
            //CASE.2
            if ((pair.get(lp)+ pair.get(rp) < target)) {
                lp++;

                //CASE.3
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {


     ArrayList<Integer> pair = new ArrayList<>() ;
     pair.add(1);  
     pair.add(2);  
     pair.add(3);  
     pair.add(4);  
     pair.add(5);  
     pair.add(6); 

     int target = 50;
    // PRINT FIRST SOLUTION
     System.out.println(pairSum1(pair, target));

     // PRINT 2ND SOLOTION

    // System.out.println(pairSum2(pair, target));
    }
 
}
