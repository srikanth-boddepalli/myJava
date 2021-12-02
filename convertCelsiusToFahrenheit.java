//To convert temperatures in degrees Celsius to Fahrenheit,multiply by 1.8 (or 9/5) and add 32.
class  convertCelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		System.out.println(converter(32.5) + " in Fahrenheit");
		System.out.println(converter(36) + " in Fahrenheit");
	}
	public static double converter(double a)
	{
        double b = (a * 1.8) + 32.0 ;
		return b ;
	}
	public static double converter(int a)
	{
        double b = (a * 1.8) + 32.0 ;
		return b ;
	}
}
