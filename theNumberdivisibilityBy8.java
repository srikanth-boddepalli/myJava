class theNumberdivisibilityBy8
{
	public static void main(String[] args) 
	{   int a = 72 , b = 0 , num = a;

        b = a%1000 ;
		
	 
	   if (b%8 == 0)
	   { 
		   System.out.println(num + "  is divisibility by 8 ");
	   }
	   else 
		{
		   System.out.println(num + "  is not divisibility by 8 ");
		}
	}
}
