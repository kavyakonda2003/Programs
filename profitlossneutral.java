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
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    if(X>Y)
		    {
		        System.out.println("loss");
		    }
		    else if(Y>X){
		        System.out.println("profit");
		    }
		    else
		    {
		        System.out.println("neutral");
		    }
		}
		

	}
}
