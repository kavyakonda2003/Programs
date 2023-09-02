class Codechef
{
	public static void main (String[] args)
	{
	    int Age = 25;
        int Vage = 18;

        if (Age < Vage)
        {
            System.out.println("Not old enough to vote.");
            System.out.println("Wait for " + (Vage - Age) + " years");
        }

        else {
            System.out.println("Old enough to vote!");
        }
	}
}
