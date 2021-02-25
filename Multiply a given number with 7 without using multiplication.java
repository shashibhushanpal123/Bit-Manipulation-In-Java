// Multiply a given number with 7 without using multiplication

// Logic -> Left shift that number by 3 (2*2*2= 8n) and then subtract original number (n) form it-> (8n-n = 7n)

public class Main
{
    public static void main(String[] args) 
    {
        
        int number=10;
        
        multiplyBy7(number);
    }
      
      static void multiplyBy7(int d) {
      
      System.out.println( (d<<3) -d );
   }
}