public class reverseRightAngledTriangleStarPattern
{
 public static void main(String[] args)
  {
  int a = 6 ;
  for(int i = 0 ; i < a ; i++)
   {
    for(int j = i ; j <= a-i ; j++)
     {
      System.out.print("*");
     }
    System.out.print("\n");
   }
  }
}
  
