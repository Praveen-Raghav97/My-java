import java.util.ArrayList;

public class BST1 {

    static class Node{
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data = data;
            }
    }
      // methode to build BST

    public static Node insert(Node root , int val){
        if (root==null) {
            root = new Node(val);
            return root;
        }
        // For  add left
        if (root.data > val) {
           root.left = insert(root.left, val);
        }
        //For add right
        else{
         root.right = insert(root.right, val);
        }
        return root;
    }

    //Inorder Treversal

     public static void Inorder (Node root ){
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);
     }

     //Method for Serach a key in Bst

     public static boolean Serach(Node root, int key){
        if (root == null) {
            return false;
        }if (root.data == key) {
            return true;
        }

        if (root.data > key) {
           return Serach(root.left , key);
        }else{
            return Serach(root.right , key);
        }
        
     }


     // Method for delet  in BST
     public static Node Delet(Node root , int val){
              if (root.data < val) {
                root.right = Delet(root.right, val);
              }

              else if(root.data > val){
                 root.left = Delet(root.left, val);
              }

              else{ // voila
                  
                // case-1: leaf node
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case-2:single node
                if (root.left == null) {
                    return root.right;
                }
                else if (root.right == null) {
                    return root.left ;
                }

                //Case-3: Both children
                Node IS = findInOrderSuccesror(root.right);
                root.data = IS.data;
                root.right = Delet(root.right, IS.data);
              }
              return root;
     }

     // Inorder Succesor 
     public static Node findInOrderSuccesror(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
     }

     // Print Range in BST Tree

     public static void Range(Node root, int k1 , int k2 ){
        if (root == null) {
            return ;
        }
        if (root.data >= k1 && root.data <=k2) {
            Range(root.left, k1, k2);
            System.out.print(root.data + " ");
            Range(root.right, k1, k2);
        }
        else if(root.data <k1){
               Range(root.left, k1, k2);
        }
        else{
            Range(root.right, k1, k2);
        }
     }


     // methode for print all paths

     public static void Printroot2Leaf(Node root , ArrayList<Integer> path){
               if (root == null) {
                return ;
               }

               path.add(root.data);
               if (root.left == null && root.right == null) {
                PrintPAth( path);
               }
               Printroot2Leaf(root.left, path);
               Printroot2Leaf(root.right, path);
               path.remove(path.size()-1);
     }
     //Print PAth
     public static void PrintPAth(ArrayList<Integer> path){
        for(int i = 0; i<path.size() ; i++){
            System.out.print(path.get(i)+ "->>");
        }
        System.out.println("Null");
     }


    public static void main(String[] args) {
        //int values[] ={5,1,3,4,2,7};
        int values [] = {8,5,3,6,10,11,14};
        Node root = null;
        int key = 3;


        for(int i = 0; i<values.length; i++){
            root = insert(root, values [i]);
        }

        Inorder(root);
        System.out.println();
         

        // method call for search  a tree

        // if (Serach(root, key)) {
       // System.out.println("key is found = " + key);
     // }else{
        //System.out.println("key is not found = " + key);
     // }



   // method call for delet

   // root=  Delet(root, 1);
   // System.out.println();
   // Inorder(root);


     //Methode call for Print range

     //Range(root, 2, 7);

     //Method call for print all path

     Printroot2Leaf(root , new ArrayList<>());
    }
}
