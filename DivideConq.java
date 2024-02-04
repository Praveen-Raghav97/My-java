public class DivideConq {
    //---Print Array ---
       public static void PrintArr(int arr[] ) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
       }
    //------Merge Sort------//
    public static void MergeSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        // Work
        int mid =si+(ei-si)/2;
        MergeSort(arr, si, mid); //left side
        MergeSort(arr, mid+1, ei); //right side
        Merge(arr, si, mid, ei);
    }

    
    public static void Merge(int arr[], int si, int mid, int ei){
        // left(0-3)=4, right mid+1(4-6)
        int temp [] = new int[ei-si+1];
        int i= si; // iterator for left
        int j= mid+1; //iterator for right
        int k= 0;  // iterator for temp arr

        while (i<=mid & j<=ei) {
           if (arr[i] < arr[j]) {
            temp [k]= arr[i];
            i++;
           }
           else{
            temp[k]= arr[j];
            j++;
           }
           k++; 
        }

        //For left
        while ( i <= mid) {
            temp[k++]=arr[i++];
        }

        //For right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //Copy to Temp array in orginal array
        for(k=0, i=si; k < temp.length; k++ ,i++){
            arr[i]=temp[k];
        }



    }
  
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-8};
        MergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
