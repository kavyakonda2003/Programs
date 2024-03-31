import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x=sc.nextInt();
		    if(x<3)
		    {
		        System.out.println("Light");
		    }
		    else if(x>=3 && x<7)
		    {
		        System.out.println("Moderate");
		    }
		    else
		    {
		        System.out.println("Heavy");
		    }
		}

	}
}
