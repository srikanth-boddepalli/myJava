class theNumberdivisibilityBy9OrNot
{
	public static void main(String[] args) 
	{   int a = 2367 , b = 0 , temp = 0, num = a;
        while(a>0)
		{
        b = a%10 ;
		temp = temp + b ;
		a = a/10 ;
			
		}
	 
	   if (temp % 9 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 9 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 9 ");
		}
	}
}

