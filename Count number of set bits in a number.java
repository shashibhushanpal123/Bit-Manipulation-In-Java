// Count number of set bits in a number

/* Logic -> 1) %2==1 means odd and hence contain  1 in LSB 
            2) /2 for shifiting bits to right (Right shift by 1) */

public class Main
{
	public static void main(String[] args) {
		
		int count=0;
		int n=15;
		
		while(n!=0)
		{
		  if(n%2==1)
		  ++count;
		  
		  n=n/2;
		  
		}
		System.out.println(count);
	}
}
