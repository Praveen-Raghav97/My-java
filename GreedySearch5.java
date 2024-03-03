import java.util.*;

//-------------Max chain of pairs----------

public class GreedySearch5 {
    public static void main(String[] args) {
        int pair [] [] ={{5,24},{39,60},{5,28},{27,40},{50,90}};


        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pair[0][1];
        for(int i=1; i<pair.length; i++){
            if (pair[i][0]> chainEnd) {
                chainLen++;
                chainEnd += pair[0][1];
            }
        }
        System.out.println("chain of pair = " +chainLen);
    }
}
