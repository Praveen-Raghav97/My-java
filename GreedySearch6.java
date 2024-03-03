import java.util.*;

                                // Q-6 min coins to used----
public class GreedySearch6 {
    public static void main(String[] args) {
        Integer coins [] ={1,2,5,10,20,50,100,500,2000};
         

        // Arrays sort in reverse order
        Arrays.sort(coins, Comparator.reverseOrder());

        int countofCoins = 0;
        int amount =450;

        //create Array to Store answer
        ArrayList<Integer> ans = new ArrayList<>();
             
        //Loop for reach all index.
        for(int i=0; i<coins.length; i++){
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -=coins[i];
                }
            }
        }

        //Print count of used coin
        System.out.println("min coin count is = " +countofCoins);
          
        //Loop for Print all coins is used in.
        for(int i=0; i<ans.size(); i++){
            System.out.println("this coins is used in = "  +ans.get(i));
        }
        System.out.println();
    }
}
