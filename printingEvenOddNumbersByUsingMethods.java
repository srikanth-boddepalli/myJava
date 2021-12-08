class  printingEvenOddNumbersByUsingMethods
{
	public static void main(String[] args) 
	{
	    evenNumbers(100);
		oddNumbers(100);
	}
	public static void evenNumbers(int a)
		{
          for (int i = 1;i <=a ; i++ )
          {   
			  if(i%2 == 0)
			  {
			  System.out.print(i + ", ");
			  }
          }
		  System.out.println(" ");
        }
	public static void oddNumbers(int a)
		{
          for (int i = 1;i <=a ; i++ )
          {
			  if(i%2 == 1)
			  {
			  System.out.print(i+ ", ");
			  }
          }
		  System.out.println(" ");
        }
}
