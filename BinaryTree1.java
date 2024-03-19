import java.util.*;
import java.util.LinkedList;

public class BinaryTree1 {

    static class Node{
    int data;
    Node left;
    Node right;

       Node(int data){
        this.data=data;
        this.left= null;
        this.right= null;

       }
        
    }

    //Class for binary tree
      static class BinaryTree {
        static int idx =-1;

        //Method for binary tree
        public static Node BuildTree( int nodes[]){
          idx++;
          if (nodes[idx]==-1) {
            return null;
          }
        Node newNode = new Node(nodes[idx]);
        newNode.left =BuildTree(nodes);
        newNode.right =BuildTree(nodes);
        return newNode;
        }
        
        //Method for Pre-Order Traversal
        public static void PreOrder(Node root){
            if (root ==null) {
                return ;
            }
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
       //methode for In-order traversal
       public static void inOrder(Node root){
        if (root == null) {
            return;
        }
       
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
       }
       //Methode for Post-Order Traversal
       public static void postOrder( Node root){
        if (root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
       }

       // Level order Traversal
        
       public static void levelorder(Node root){
        if (root==null) {
            return;
        }

        // Create a queue for use bfs 

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
 
         while (!q.isEmpty()) {
            Node cuurNode = q.remove();
            if (cuurNode == null) {
                System.out.println(); // add new line
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);  
                }
            }else{
                System.out.print(cuurNode.data +" ");
                if (cuurNode.left != null) {
                    q.add(cuurNode.left);
                }if (cuurNode.right != null) {
                    q.add(cuurNode.right);
                }
            }
         }
       }

       

      }
     public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root =tree.BuildTree(nodes);
       //tree.PreOrder(root);
       //tree.inOrder(root);
       //tree.postOrder(root);
       tree.levelorder(root);
     }
}
