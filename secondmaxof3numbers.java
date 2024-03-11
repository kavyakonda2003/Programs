import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a>b&&a>c){
		        if(b>c){
		            System.out.println(b);
		        }
		        else{
		            System.out.println(c);
		        }
		    }
		    else if(b>a&&b>c)
		    {
		        if(a>c)
		        {
		            System.out.println(a);
		        }
		        else{
		            System.out.println(c);
		        }
		    }
		    else {
		        if(a>b){
		            System.out.println(a);
		        }
		        else{
		            System.out.println(b);
		        }
		    }
		}
		

	}
}
