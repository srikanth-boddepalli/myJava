public class numberIsPrimeOrNot
{
 public static void main(String[] args)
 {
  int a = 22 ;
  int input ;
  //boolean temp = false ;
  for(int i = 2; i<a ; i++)
  {
   if (a%i != 0)
   {
    System.out.println(" it is prime number");
    break ;
   }
   else
   {
    System.out.println(" it is not prime number");
    break;
   }   
  }
 }
}
