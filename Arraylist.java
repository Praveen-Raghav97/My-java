import java.util.ArrayList;
import java.util.Collections;
// TO SORT THE ARRAY LIST 
public class Arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> list= new ArrayList<>();
    list.add(2); 
    list.add(5); 
    list.add(6); 
    list.add(6); 
    list.add(3);
    //ARRAY LIST BEFORE THE SORT
    System.out.println(list);
    // USE COLLECTIONS.SORT() TO SORT THE ARRAY LIST
    Collections.sort(list);
    //ARRAY AFTER THE SORT
    System.out.println(list); 
    }
}
