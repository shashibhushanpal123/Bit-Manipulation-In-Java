// Count number of set bits in a number (Approach 3-> Brian Kernighan’s Algorithm )

/* Logic -> (n = n & n-1) ANDing "n" with "n-1", so in each step we are unsetting the set bits.
            So, the number of times loops execute=number of set bits, whom we are making unset
*/
public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		int n=13;
		
		while(n!=0)
		{
		  n= n & n-1;
		  ++count;
		  
		}
		System.out.println(count);
	}
}