import java.math.*;
// Check whether the given number is power of 4 (Approach 1)

// Logic -> Take Log base 4 of that number(say we get answer), and then do Math.pow(4,answer) if it is=number then yes otherwise no

public class Main
{
    public static void main(String[] args) 
    {
        
        double number=1;
        
        double ans=log4(number);
        
        if(number!=0 && Math.pow(4,ans)==number)
        System.out.println("Yes");
        
        else
        System.out.println("No");
    }
      
    //Function to calculate Log Base 4
      static double log4(double d) {
      
      return Math.floor(Math.log(d)/Math.log(4.0));
   }
}
