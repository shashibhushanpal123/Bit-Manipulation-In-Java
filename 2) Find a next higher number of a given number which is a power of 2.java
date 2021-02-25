// Find a next higher number of a given number which is a power of 2 (Approach 2)

// Logic -> Right shift the given number until we reach to 0, and then do Left shift (of 1) that times which we have done right shifts

public class Main
{
    public static void main(String[] args) 
    {
        
        int number=32;
        
        //count is for counting how many times we have done right shifts
        int count=0;
        while(number !=0)
        {
            number =number >>1;
            ++count;
        }
        
        number=1;
        
        //Performing Left Shifts, to count number of times (Times upto which we have done Right Shifts)
        while(count !=0)
        {
            number =number <<1;
            --count;
        }
        
        System.out.println(number);
    }
}
