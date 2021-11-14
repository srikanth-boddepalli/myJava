public class numberReverse
{
 public static void main(String[] args)
 {
   int num = 1023 ;
   int num1 =0; 
   int temp ;
  while(num > 0 )
  {
   temp = num % 10 ;
   num1 = num1 * 10 +temp ;
   num = num/10 ;
   //System.out.println(num1);
   //System.out.println(num); 
  }
  System.out.println(num1);
 }
} 