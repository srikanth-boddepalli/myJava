class  printingNaturalWholeAndIntegersNumbersByUsingMethods
{
	public static void main(String[] args) 
	{
	    naturalNumbers(100);
		wholeNumbers(100);
		integersNumbers(100);

	}
	public static void naturalNumbers(int a)
		{
          for (int i = 1;i <=a ; i++ )
          {
			  System.out.print(i + ", ");
          }
		  System.out.println(" ");
        }
	public static void wholeNumbers(int a)
		{
          for (int i = 0;i <=a ; i++ )
          {
			  System.out.print(i+ ", ");
          }
		  System.out.println(" ");
        }
	public static void integersNumbers(int a)
		{
          for (int i = -100 ;i <=a ; i++ )
          {
			  System.out.print(i+ ", ");
          }
		  System.out.println(" ");
        }
}
