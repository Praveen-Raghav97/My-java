import java.util.*;
public class GreedySearch3 {
    public static void main(String[] args) {
        int val[] ={60,100,120};
        int weight[]={10,20,30};
          int w = 50;
          double ratio [][] = new double[val.length][2];
          //0th coll => idx; 1st col =>ratio
           
          for(int i=0; i<val.length; i++){
            ratio[i][0]=i;
            ratio[i][1]= val[i]/(double)weight[i];
          }


          // acending order
           Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
           int capcity = w;
           int finalVal= 0;


           for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if (capcity >= weight[idx]) {
                finalVal += val[idx];
                capcity -= weight[idx];
            }else{
                //include fractional item
                finalVal += (ratio[i][1] * capcity);
                capcity = 0;
                break;
            }

           }
           System.out.println("final value is = " +finalVal);
    }
}
