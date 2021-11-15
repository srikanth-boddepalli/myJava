public class doWhileLoopeEx
{
 public static void main(String[] args)
 {
  int num = 10 ;
  int sum = 0 ;
  int i = 1 ;
  do
  {
   sum = sum + i ;
   i++ ;
  }
  while(i <= 10);
  System.out.println(sum);
 }
}