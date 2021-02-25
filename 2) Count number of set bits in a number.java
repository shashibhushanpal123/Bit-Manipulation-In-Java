// Count number of set bits in a number (Approach 2)

// Logic -> 1) [& 1 >= 1] means odd and hence contain  1 in LSB 
//          2) /2 OR >> 1 for shifiting bits to right (Right shift by 1)

public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		int n=15;
		
		while(n!=0)
		{
		  if( (n & 1) >=1)
		  ++count;
		  
		  n=n>> 1;
		  
		}
		System.out.println(count);
	}
}