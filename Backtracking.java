
public class Backtracking {
    //--Find Permutation Of String---
    public static void Findper(String str, String ans){

    
    //Base Case
    if (str.length()==0) {
        System.out.println(ans);
        return;
        
    }
    //recursion
    for(int i=0; i<str.length(); i++){
        char curr= str.charAt(i);
       String Newstr= str.substring(0, i)+ str.substring(i+1);
       Findper(Newstr, ans+curr); 
    }
}

    public static void main(String[] args) {
        String str= "ram";
        Findper(str, "");

    }
}