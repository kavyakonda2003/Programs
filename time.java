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
		    if(x>=1 && x<=4)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");
		    }
		}

	}
}