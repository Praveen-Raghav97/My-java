import java.util.ArrayList;
 

                              // last common ancestor time comlexity with o(n);
                              
public class BinaryTree7 {
    
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

        //Methode for GetPath
        public static boolean getPath(Node root , int n, ArrayList<Node> path){
            if (root == null) {
                return false;
            }
            path.add(root);
            if (root.data == n) {
                return true;
            }

            boolean foundleft = getPath(root.left, n, path);
            boolean foundright = getPath(root.right, n, path);
            if (foundleft || foundright) {
               return true ; 
            }
            path.remove(path.size()-1);
            return false;
        }

        //Method-1 for LAst common ancestor  time Complexity o(n) with linear space;

        public static Node lca(Node root , int n1 , int n2  ){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            // last common ancestor
             
            int  i= 0;
            for(; i < path1.size() && i<path2.size(); i++){
                  if (path1.get(i) != path2.get(i)) {
                    break;
                  }
            }

            // last Equal node -> i-1th
            Node lca = path1.get(i-1);
            return lca;

        }


        //Method 2nd Last common ancestor time complexity o(n) with constant space;

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
    int n2 =7;

   // System.out.println(lca(root, n1, n2).data);

    System.out.println(lca2(root, n1, n2).data);

}
}
