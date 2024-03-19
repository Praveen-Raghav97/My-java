import java.util.ArrayList;

public class Heap1 {
    
    static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

            //ADD Methode

    public void add(int data){
         //add at last
         arr.add(data);

         int x =arr.size()-1; //Child Node
         int par = (x-1)/2; //Parent Node

         while (arr.get(x) < arr.get(par)) {

            //swap

            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);


            x= par;
            par= (x-1)/2;
         }
    }

    // Peek Method Get Minimum 


    public int peek(){
        return arr.get(0);
    }

    //heapfy method
    private void Heapify(int i) {
      
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;

        if (left<arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx =left;
        }

        if (right <arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }

        if (minIdx != i) {
            //swap
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            Heapify(minIdx);
        }
        
    }
    //Method for delet

    public int remove(){
   int data = arr.get(0);
        //step.1 swap first and last

        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        //Step.2 delet last i
        arr.remove(arr.size()-1);

        //step.3 call heapfy methode
        Heapify(0);
        return data;
         

    }
    //Method for check heap is empty

    public boolean isEmpty(){
        return arr.size() ==  0;
    }
        
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
        
    }
}
