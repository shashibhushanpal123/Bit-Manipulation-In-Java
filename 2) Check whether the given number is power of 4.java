// Check whether the given number is power of 4 (Approach 2)

// Logic -> Repeatedly divide it by 4 and if we left only with 1 then "yes" otherwise "no"

public class Main
{
    public static void main(String[] args) 
    {
        int number=64;
        
        while(number!=0 && number%4==0)
        {
            number=number/4;
        }
        
        if(number==1)
        System.out.println("Yes");
        
        else
        System.out.println("No");
    }
      
   }