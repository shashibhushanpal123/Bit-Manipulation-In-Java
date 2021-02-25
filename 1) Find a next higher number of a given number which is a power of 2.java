import java.math.*;
// Find a next higher number of a given number which is a power of 2 (Approach 1)

// Logic -> Calculating Log Base 2 of given number and then applying floor of it +1, and resultant number is calculated as power of 2 

public class Main
{
    public static void main(String[] args) 
    {
        
        int number=6;
    
        if(number==0)
        System.out.println(1);
        
        else
        {
        double res=Math.floor(log2(number)+1);
        System.out.println(res);
        double ans=Math.pow(2,res);
        System.out.println(ans);
        }
        
    }
    
      //Function for calculating Log Base 2
      
      static double log2(double d) {
      return Math.log(d)/Math.log(2.0);
   }
}