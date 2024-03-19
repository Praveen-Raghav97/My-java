public class BST2 {
    

        static class Node{
                int data;
                Node left;
                Node right;
    
                Node(int data){
                    this.data = data;
                }
        }
 public static void Preorder(Node root){
    if (root == null) {
        return;
    }
    
    System.out.print(root.data + " ");
    Preorder(root.left);
    Preorder(root.right);
 }

 public static Node createBSt(int arr[], int st , int end){
    if (st > end) {
        return null;
    }
        int mid =  (st+end)/2;
        Node root = new Node(arr[mid]);
       root.left = createBSt(arr, st, mid-1);
       root.right = createBSt(arr, mid+1, end);
       return root;
    
 }

public static void main(String[] args) {
    int arr [] ={3,5,6,8,10,11,12};

    /*
             8
            / \
           5   11
          / \  / \
          3 6  10 12

     */


     Node root =createBSt(arr, 0, arr.length-1);
     Preorder(root);
}

}



