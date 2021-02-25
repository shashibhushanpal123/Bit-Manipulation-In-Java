// Check whether the given number is power of 2 (Approach 2)

/* Logic -> (n & n-1) == 0 because if it is a power of 2 then it contains only 1 set bit, and by doing n-1 we get toggling, and hence
                         result is 0.
*/

public class Main
{
    public static void main(String[] args) 
    {
        
        int number=16;
        
        if( number !=0 && (number & number-1) ==0 )
        System.out.println("Yes");
        
        else
        System.out.println("No");
         
    }
}
