public class starPattern5
{
 public static void main(String[] args)
 {
  for(int j=1 ; j <= 5 ;j++)
  {
   
   for(int i=1 ; i<= 5 ; i++)
   {
    if((j==1&&i==1)||(j==2&&i==2)||(j==3&&i==3)||(j==4&&i==4)||(j==5&&i==5))
    {
    System.out.print("*"); 
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