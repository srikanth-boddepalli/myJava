public class starPatterns2
{
 public static void main(String[] args)
 {
  for(int j=1 ; j <= 3 ;j++)
  {
   
   for(int i=1 ; i<= 5 ; i++)
   {
    if(j==2 && i == 3)
    { 
     System.out.print("@");
    }
    else
    {
     System.out.print("*");  
    }
   }
   System.out.println();
  }
 }
}   