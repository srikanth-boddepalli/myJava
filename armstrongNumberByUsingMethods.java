class armstrongNumberByUsingMethods 
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
		   System.out.println(num + "  is armstrong number");
	   }
	   else 
		{
		   System.out.println(num + "  is not a armstrong number");
		}
	}
		public static int factorial(int a)
	{   int d ;
		d  = a * a* a ;
		return d ;
	}
}
