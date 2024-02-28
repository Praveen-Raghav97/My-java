import java.util.LinkedList;
import java.util.Queue;

            //----------InterLeave the Queue 12345678910 // output=16273849510
public class Queue4 {
     
    public static void Interleave( Queue<Integer> q){
           Queue<Integer> FirstHalf = new LinkedList<>();
           int size = q.size();
           for(int i= 0; i<size/2; i++){
              FirstHalf.add(q.remove());
           }

           while (!FirstHalf.isEmpty()) {
                 q.add(FirstHalf.remove());
                 q.add(q.remove());
           }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
         
        Interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+ " ");
        }
    }
}
