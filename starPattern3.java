public class starPattern3
{
 public static void main(String[] args)
 {
  for(int j=1 ; j <= 3 ;j++)
  {
   
   for(int i=1 ; i<= 4 ; i++)
   {
    if(i==2 || i== 3 || j == 2)
    { 
     System.out.print("*");
    }
    else
    {
     if(j==1 && i == 1)
     {
      System.out.print("@");
     } 
     else if(j == 1 && i == 4)
     {
      System.out.print("#");   
     }
     else if(j == 3 && i == 1)
     {
      System.out.print("$"); 
     }
     else if(j == 3 && i == 4)
     {
      System.out.print("~"); 
     }
    }
   }
   System.out.println();
  }  
 }
}   