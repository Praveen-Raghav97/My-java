             
             //----------Queue using array ---------


public class Queue1 {
    static class QueueB{
         static int arr[];
         static int size;
         static int rear;

       QueueB(int n){
           arr = new int [n];
           size = n;
           rear = -1;
       } 
       
       // is Empty method
       public static boolean isEmpty(){
        return rear == -1;
       }
          //Add method
          public static void add(int data){
           if (rear == size-1) {
            System.out.println("Queue is full");
            return;
           }
           else{
                rear = rear+1;
                arr[rear] = data;
           }
          }

          //Remove method
          public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i]= arr[i+1];
            }
            rear = rear-1;
            return front;
          }

          //Peek methode
          public static int Peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
               return -1;
            }
            return arr[0];
          }


    }
    public static void main(String[] args) {
        QueueB k = new QueueB(3);
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);

        while (!k.isEmpty()) {
            System.out.println(k.Peek());
              k.remove();
        }
    }
}