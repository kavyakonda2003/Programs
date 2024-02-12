import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
		int x=sc.nextInt();
		int y=sc.nextInt();
	
		if(x>y)
		{
		    int investment=x-y;
		    System.out.println(investment);
		}
		else{
		    System.out.println(x);
		    
		}
		}
		
		
		
		
		
		

	}
}
