public class starPattern12
{
 public static void main(String[] args)
 {
  int star = 0 ;
  for(int j=1 ; j <= 5 ;j++)
  {
   star++ ;   
   for(int i=1 ; i<=star ; i++)
   {
    if(j == 4 && i== 2) 
    { 
     System.out.print("~");
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