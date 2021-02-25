// Check whether K-th bit is set or not

public class Main
{
	public static void main(String[] args) {
		
		int n=5;  // 1 0 1  in binary
		int k=3; // 3rd bit is 1 so, SET
		
		check(n,k);
		
	}
	
	static void check(int n, int k)
	{
	    if( (n & (1 << (k-1) ) ) >= 1 )
	    System.out.println("Set");
	    
	    else
	    System.out.println("Not Set");
	}
}