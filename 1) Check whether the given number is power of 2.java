// Check whether the given number is power of 2 (Approach 1-> Using concept of counting Set Bits)

/* Logic -> If we found only "one" 1 then it is a power of 2, since a number which is power of 2 has only 1 set bit. */ 

public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		int n=64;
		
		while(n!=0)
		{
		    if(n%2!=0)
		    {
		        ++count;
		    }
		    
		    n=n/2;
		}
		
		if(count==1)
		System.out.println("Yes");
		
		else
		System.out.println("No");
	}
}
