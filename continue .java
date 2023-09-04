import java.util.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int n= read.nextInt();
		for(int i = 0; i <= 12; i++){
		    if(i == n){
		        continue;
		    }
		    System.out.println(i);
		}
	}
}
