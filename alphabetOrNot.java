//check the given ch contains as an alphabet

public class alphabetOrNot
{
 public static void main(String[] args)
 {
  char ch = 'H' ;
  if((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch <= 'Z'))
  {
   System.out.println(" char is alphabet ");
  }
  else 
  {
   System.out.println(" char is not alphadet ");
  }
 }
}