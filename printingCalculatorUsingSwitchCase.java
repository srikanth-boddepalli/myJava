//calculator using switch case
class  printingCalculatorUsingSwitchCase
{
	public static void main(String[] args) 
	{   int a = 20 ;
	    int b = 10 ;
		String c = "a/b" ;
		   print(c, 20,10);
	}
	public static void print(String c,int a, int b) 
	{   
		switch(c)
	{
	case "a+b" :
		{
		System.out.print(a+b);
		break;
		}
	case "a-b" :
		{
		System.out.print(a-b);
		break;
		}
	case "a/b" :
		{
		System.out.print(a/b);
		break;
		}
	case "a*b" :
		{
		System.out.print(a*b);
		break;
		}
	}
	}
}
