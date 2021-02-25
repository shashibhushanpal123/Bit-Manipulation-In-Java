// Clear kth bit of number

// Logic -> ( n & ~ (1<<k) )

public class Main
{
	public static void main(String[] args) {
		
		int n=15;
		int k=3;
		
		turnOff(n,k);
	}
	
	static void turnOff(int n, int k)
	{
	    System.out.println( n & ~ (1<<k) );
	}
		
}