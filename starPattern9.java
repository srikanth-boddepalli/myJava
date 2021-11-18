public class starPattern9
{
 public static void main(String[] args)
 {
  for(int j=1 ; j <= 5 ;j++)
  {   
   for(int i=1 ; i<= 5 ; i++)
   {
    if(j == 1|| j == 5|| i== 1||i == 5) 
    { 
     System.out.print("*");
    }
    else if((i == 2 && j == 2) ||(i== 4 && j == 4))
    {
     System.out.print("~");
    }
    else if((i == 3 && j == 3))
    {
     System.out.print("@");
    }  
    else
    {
    System.out.print(" "); 
    }   
   }
   System.out.println();
  }  
 }
}   