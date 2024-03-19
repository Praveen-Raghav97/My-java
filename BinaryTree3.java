public class BinaryTree3 {
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
            //Diameter of tree o(n.sqrt) 
          
            public static int Diameter(Node root){
                if (root == null) {
                  return 0;
                }
                 int leftDia = Diameter(root.left);
                 int leftHeight = height(root.left);
                 int rightDia = Diameter(root.right);
                 int rightHeight = height(root.right);
    
                 int selfDia = leftHeight + rightHeight +1;
    
                 return Math.max( selfDia, Math.max(leftDia, rightDia));
    
              }

              //Class
              static class Info {
              int diam ;
              int ht;

              public Info(int diam, int ht){
                      this.diam = diam;
                      this.ht = ht;
              }
                
              }

              // 2nd ..Method for Diameter o(0);

              public static Info Diamaeter1(Node root){
                if (root ==  null) {
                    return new Info (0,0);
                }

                Info leftInfo = Diamaeter1(root.left);
                Info rightInfo = Diamaeter1(root.right);

                int diam = Math.max(Math.max(leftInfo.diam , rightInfo.diam), leftInfo.ht + rightInfo.ht +1);
                int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
                return new Info ( diam ,ht);
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

         //Print Diamaeter of tree

      //System.out.println("The Total Diameter of Tree = " +Diameter(root));

       //Print Diamaeter of tree

      System.out.println("The Total Diameter of Tree = " + Diamaeter1(root).diam);


              
}
}
