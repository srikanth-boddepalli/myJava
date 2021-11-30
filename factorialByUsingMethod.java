class  factorialByUsingMethod
{
	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}
	public static int factorial(int a)
	{   int fact = 1 ;
		for (int i = 1;i <= a ; i++)
		{
			fact = i * fact ;
			
		}
		return fact;
	}
}
