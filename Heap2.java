public class Heap2 {

    //Heapify method
    public static void Heapify(int arr[] , int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }

        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            Heapify(arr, 0, size);
        }
    }

    //Method for heap sort

    public static void heapSort(int arr[]){

        // 1.step build max heap
        int n = arr.length;

        for(int i = n/2; i>=0; i--){
             Heapify(arr, i, n);
        }

        //step.2 Push larget at end

        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i]= temp; 


            Heapify(arr, 0, i);
        }

 }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5};
        
        heapSort(arr);

        for(int i =0;  i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
