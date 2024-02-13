import java.util.ArrayList; // INBUILT PACKAGE IMPORT

// MULTI DIAMETIONAL ARRAY LIST

public class MultiArrayList {

    public static void main(String[] args) {
      // CREATE AN MAIN ARRAY LIST
      ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
     
      //CREATE SUB ARRAY LIST AND ADD TO MAIN ARRAY LIST
      ArrayList<Integer> list = new ArrayList<>();
      list.add(2); list.add(3);
      mainList.add(list); //ADD

      //CREATE SUB ARRAY LIST AND ADD TO MAIN ARRAY LIST
      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(4); list2.add(5);
      mainList.add(list2); //ADD
      
    // USE NESTED LOOPS TO PRINT THE ARRAY LIST
      for(int i=0; i<mainList.size(); i++){
        ArrayList <Integer> currList= mainList.get(i);
        for(int j=0; j<currList.size(); j++){
              System.out.print(currList.get(j)+ " ");
        }
        System.out.println();
      }
      // TO PRINT MAIN  ARRAY LIST//
      System.out.println(mainList);

    }
}