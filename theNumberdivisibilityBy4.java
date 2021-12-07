class theNumberdivisibilityBy4
{
	public static void main(String[] args) 
	{   int a = 8 , b = 0 , num = a;

        b = a%100 ;
		
	 
	   if (b%4 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 4 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 4 ");
		}
	}
}