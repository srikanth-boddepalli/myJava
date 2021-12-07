class theNumberdivisibilityBy6OrNot
{
	public static void main(String[] args) 
	{   int a = 2366 , b = 0 , temp = 0, num = a;
        while(a>0)
		{
        b = a%10 ;
		temp = temp + b ;
		a = a/10 ;
			
		}
	 
	   if (temp % 6 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 6 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 6 ");
		}
	}
}

