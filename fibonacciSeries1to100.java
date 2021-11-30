class fibonacciSeries1to100 
{
	public static void main(String[] args) 
	{
		int num = 1,sum = 1 , temp; 
		while(num <= 100)
		{
			sum = sum + num;
			temp = sum ;
			sum = num ;
			num = temp ;
			System.out.println(sum);
        }
	}
}
