
              
               //---------------Queue using linkedList-----


public class QueueLL {

    static class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    } 
    }
    static class QueueB{
      static Node head = null;
      static Node tail = null;
      
      
      // is Empty method
      public static boolean isEmpty(){
       return head == null && tail == null;
      }
         //Add method
         public static void add(int data){
          Node newNode =new Node(data);
          if (head==null) {
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
         }

         //Remove method
         public static int remove(){
           if (isEmpty()) {
               System.out.println("Queue is empty");
               return -1;
           }

           //single element
           int front = head.data;
           if (tail==head) {
            tail = head = null;
           }else{
            head = head.next;
           }
           
          
           return front;
         }

         //Peek methode
         public static int Peek(){
           if (isEmpty()) {
               System.out.println("Queue is empty");
              return -1;
           }
           return head.data;
         }
    public static void main(String[] args) {
        QueueB k = new QueueB();
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
}
