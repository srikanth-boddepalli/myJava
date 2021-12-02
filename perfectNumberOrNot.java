class perfectNumberOrNot
{
	public static void main(String[] args) 
	{   int d = 6 ;
	   if(perfectNum(d) == d)
		{
		   System.out.println(d +"  perfect number");
		}
		else
		{
		   System.out.println(d +"  not perfect number");
		}
	}
	public static int perfectNum(int a) 
	{   int c =0 ;
		for(int i = 1; i < a ; i++)
			{ 
			   
			   if (a % i == 0)
			   {
				   c = i + c ;
			   }
				  
			}
			return c ;
	}
}
