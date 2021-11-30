class strongNumberByUsingMethods 
{
	public static void main(String[] args) 
	{   int a = 531 , b,c = 0 , num = a;

       while (a>0)
       {
        b = a%10 ;
		c =factorial(b) + c ;
		a = a/10 ;
	   }
	   System.out.println(c);
	   if (c == num)
	   { 
		   System.out.println(num + "  is strong number");
	   }
	   else 
		{
		   System.out.println(num + "  is not a strong number");
		}
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
