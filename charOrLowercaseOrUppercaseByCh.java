//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
public class charOrLowercaseOrUppercaseByCh
{
 public static void main(String[] args)
 {
  char ch = 'K';
  if(ch >= 'a' && ch <= 'z')
  {
   System.out.println("character is lowercase");
  }
  if(ch >= 'A' && ch <= 'Z')
  {
   System.out.println("the character is uppercase");
  }
  else
  {
   System.out.println("the character is not lowercase and uppercase");
  } 
 }
}
  