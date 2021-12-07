class theNumberdivisibilityBy3OrNot
{
	public static void main(String[] args) 
	{   int a = 2362 , b = 0 , temp = 0, num = a;
        while(a>0)
		{
        b = a%10 ;
		temp = temp + b ;
		a = a/10 ;
				System.out.println(temp);
		}
		System.out.println(temp);
	 
	   if (temp % 3 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 3 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 3 ");
		}
	}
}
