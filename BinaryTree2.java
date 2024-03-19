        //---------THE MAX HEIGHT OF TREE



public class BinaryTree2 {
  // CLASS FOR NODE
    static class Node{
        int data;
        Node left;
        Node right;
    
         public  Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
    
           }
            
        }

        //Method for find max height

        public static int height(Node root) {
            if (root == null) {
               return 0;
            } 
           int leftHeight = height(root.left);     // Cal left-height
          int  rightHeight = height(root.right);   // cal right height
          return  Math.max(leftHeight , rightHeight) +1;  
            
          }

          //Methode for count Elment of tree

          public static int Count(Node root){
            if (root==null) {
                return 0;
            }
            int countleft = Count(root.left); 
            int countright = Count(root.right);
            int totalCount = (countleft+countright) +1;
            return totalCount;
          }
        //method for sum of tree elements

          public static int Sum(Node root){
            if (root==null) {
                return 0;
            }
             int leftsum = Sum(root.left);
             int rightsum = Sum(root.right);
             int totalsum = (leftsum + rightsum) + root.data;
             return totalsum;
          }

        
    public static void main(String[] args) {
        /*
                 1
               /  \
              2    3
             / \   / \
            4   5 6  7


         */
// define Node object
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

         //Print HEIGHT OF TREE

        // System.out.print("The max height of tree = " +height(root));

        //PRINT COUNT OF TREE

       // System.out.println("THE TOTAL COUNT OF ELEMENTS = " +Count(root));

       //PRINT SUM OF TREE
      // System.out.println("THEE SUM OF TREE = " +Sum(root));

      
    }
}
