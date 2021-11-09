//Take input of age of 3 people by user and determine oldest and youngest among them.

public class findOutOldestAndYoungestInThree
{
 public static void main(String[] arg)
 {
  int a = 45 ;
  int b = 21 ;
  int c = 50 ;
  if( a > b && a>c)
  {
   System.out.println("a is oldest");
   if(b > c)
   {
    System.out.println("c is youngest");
   }
   else
   {
    System.out.println("b is youngest");
   }
  }
  if( b > a && b >c)
  {
   System.out.println("a is oldest");
   if( a>c)
   {
    System.out.println("c is youngest");
   }
   else
   {
    System.out.println("a is youngest");
   }
  }
  if(c>a && c>b);
  {
   System.out.println("c is oldest");
   if(a>b)
   {
    System.out.println("b is youngest");
   }
   else
   {
    System.out.println("a is youngest");
   }
  }
 }
}
  