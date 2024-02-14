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
		
		for(int i=1;i<=test;i++){
	     	int N=sc.nextInt();
		if(N%2==0)
		{
		    System.out.println(N/2);
		    System.out.println(N/2);
		}
		else
		{
		    System.out.println((N/2)+1);
		    System.out.println(N/2);
		    
		}
		
		}
	}
}
