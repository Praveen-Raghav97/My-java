public class Backtracking {
    ///---Find Subset of String ---
    public static void findSubsets(String  str,String ans,int i){
        //Base case
        if (i == str.length()) {
            System.out.println(ans);
          return;
        }
          //Yes choice
          findSubsets(str, ans+str.charAt(i),i+1);  
          //No Choice
          findSubsets(str, ans, i+1);
        }

    
    public static void main(String[] args) {
        String str ="abc";
        findSubsets(str, "", 0);
    }
    
}
