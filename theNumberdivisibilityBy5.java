class theNumberdivisibilityBy5
{
	public static void main(String[] args) 
	{   int a = 135 , b = 0 , num = a;

        b = a%10 ;
		
	 
	   if (b%5 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 5 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 5 ");
		}
	}
}