import java.util.*;
public class Heap5 {
    
    static class Row implements Comparable<Row> {
      int soliers;
      int idx;

       public Row(int soliers ,int idx) {
        this.soliers = soliers;
        this.idx = idx;
       }

       @Override
       public int compareTo(Row r2){
        if (this.soliers == r2.soliers ) {
            return this.idx - r2.idx;
        }else{
            return this.soliers - r2.soliers ;     
       }
    }
}
    public static void main(String[] args) {
       int army [] [] ={{1,0,0,0},
                        {1,1,1,1,},
                        {1,0,0,0},
                        {1,0,0,0}
                             }; 

           int k =2;
           PriorityQueue<Row> pq = new PriorityQueue<>();
           
           for(int i=0; i<army.length; i++){
            int count =0;

            for(int j=0; j <army[0].length; j++){
                 count+= army[i][j] == 1 ? 1:0;
            }
            pq.add(new Row(count, i));
           }

           //for print 
           for(int i =0; i<k; i++){
            System.out.println("R" + pq.remove().idx);
           }
    }
}

