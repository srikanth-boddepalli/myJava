class  printingIntegersIntoWords
{
	public static void main(String[] args) 
	{   int a = 97289230 ;
	    int b = a ;
		while (a > 0)
		{
		   int	c = a % 10  ;
		   print(c);
			a=a/10 ;
		}
	}
	public static void print(int c) 
	{   
		switch (c)
	{
	case 1 :
		{
		System.out.print("one ");
		break;
		}
	case 2 :
		{
		System.out.print("two ");
		break;
		}
	case 3 :
		{
		System.out.print("three ");
		break;
		}
	case 4 :
		{
		System.out.print("four ");
		break;
		}
	case 5 :
		{
		System.out.print("five ");
		break;
		}
	case 6 :
		{
		System.out.print("six ");
		break;
		}
	case 7 :
		{
		System.out.println("seven ");
		break;
		}
	case 8 :
		{
		System.out.print("eight ");
		break;
		}
	case 9 :
		{
		System.out.print("nine ");
		break;
		}
	case 0 :
		{
		System.out.print("zero ");
		break;
		}
	}
	}
}
