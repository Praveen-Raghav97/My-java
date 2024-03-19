public class BinaryTree8 {
    
                           // MINIMUM DISTANCE BETWEEN TWO  NODES 

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


        public static Node lca2( Node root , int n1 , int n2){
            if (root == null || root.data == n1|| root.data == n2) {
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            //leftLca = val , rightLca = null
            if (rightLca == null) {
                return leftLca;
            }
            if (leftLca == null) {
                return rightLca ;
            }

            return root;
        }

        //Method for To Find Minimum lca Distance Of node

        public static int lcaDist(Node root , int n){
                if (root == null) {
                    return -1;
                }

                if (root.data == n) {
                    return 0;
                }

                int leftDist = lcaDist(root.left, n);
                int rightDist = lcaDist(root.right , n);
                    
                if (leftDist == -1 && rightDist == -1) {
                    return -1;

                }else if (leftDist == -1) {
                    return rightDist +1;

                }else if (rightDist == -1) {
                    return leftDist +1;
                }
                return 0;
        }

         // To find minimum distance 
         public static int minDist( Node root , int n1 ,int n2){
             Node lca = lca2(root, n1, n2);
             int Dist1 = lcaDist(lca, n1);
             int Dist2 = lcaDist(lca, n2);


             return Dist1 + Dist2;
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

    int n1 = 4;
    int n2 =5;

    System.out.println(minDist(root, n1, n2));
}

}
