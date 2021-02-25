// Set the K-th bit of a given number

public class Main
{
	public static void main(String[] args) {
		
		int n=10;
		int k=2; //assuming k is of 0 indexing from right to left
		
		/*
		  If k is 0 indexed from right to left than, we need to left shift 1 by "k" times.
		  If k is 1 indexed from right to left than, we need to left shift 1 by "k-1" times.
		*/
		
		set(n,k);
	}
	
	static void set(int n, int k)
	{
	    System.out.println(n | 1<< k ); 
	}
	
}
