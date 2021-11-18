public class starPattern14
{
 public static void main(String[] args)
 {
  int star = 5 ;
  for(int j=1 ; j <= 5 ;j++)
  {
   star-- ;
   for(int i=1 ; i<=5 ; i++)
   { 
    if(i <= star) 
    { 
     System.out.print(" ");
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