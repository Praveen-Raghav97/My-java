
 // String Array sort by using Merge sort...
public class MergeSort {
    // print Array elements ...

    public static void printarr(String[]arr){
        for(String str : arr){
            System.out.print(str +" ");
        }
        System.out.println();
    }
 // Merge Sort method for sorting an array of string..

    public static void mergesort(String[] arr, int left, int right){
    if (left < right) {
    int mid = (left + right)/2;

    

    
   // Recursively sort the two halves
   mergesort(arr, left, mid);
    mergesort(arr, mid+1 , right);

     // Merge the sorted halves
      marge(arr, left, mid, right);
    }
}

 // Merge method to merge two sorted halves of an array...
    public static void marge(String[]arr,int left,int mid, int right){
       int m= mid - left+1;
       int n= right-mid;


       //Create a temparary aaray..
       String [] leftarr = new String[m];
       String [] rightarr= new String[n];

       // Copy data to temp array..
      System.arraycopy(arr, left, leftarr, 0, m);
      System.arraycopy(arr, mid+1, rightarr, 0, n);

 // Merge the temporary arrays back into the main array
       int k=left;
       int i=0;
       int j=0;

 
       while (i <m && j<n) {
        if (leftarr[i].compareTo(rightarr[j]) <=0) {
         arr[k] = leftarr[i] ;
         i++;
        }
        else{
            arr[k]= rightarr[j];
            j++;
        }
        k++;
       }
       //Copy remaining elements of leftarr..
       while (i < m) {
        arr[k]=leftarr[i];
        i++;
        k++;
       }
       //Copy remaining elements of rightarr..
       while (j < n) {
        arr[k]=rightarr[j];
        j++;
        k++;
       }
      
    }
 
    
    public static void main(String[] args) {
        String []arr ={"sun","earth","mars","mercury"};
       System.out.println("Orginal array:");
       printarr(arr);
       mergesort(arr,0,arr.length-1);
       System.out.println("\nSorted array:");
       printarr(arr);
      
        
    }
}
