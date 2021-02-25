Approach 2:
Another Approach is that we can And the given number with 1, by right shifting that given number by (k-1) times.

// Suppose example is 10111 (23), and we need to check whether the 4th bit 
// (i.e, 0) from right is set or not.

class RR
{
  public static void main(String[]args)
  {
    int n=23;
    int k=4;
    
   // Right Shifting that number by (k-1)times, so that, that number 
   // comes to the LSB, and then comparing that number with 1
    n>>=k-1;

   if( (n & 1) ==0)
   {
     System.out.println("Not Set");
   }
   
  else
   System.out.println("Set");

  }
}

Output: Not Set
Time Complexity=Space Complexity= O(1)
