import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
    Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i=0; i<test; i++)
        {
            int rank = sc.nextInt();
            
            if(rank <= 10)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
	}
}
