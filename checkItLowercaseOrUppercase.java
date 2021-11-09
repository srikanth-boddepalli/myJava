//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

public class checkItLowercaseOrUppercase
{
 public static void main(String[] args)
 {
  //int a = 'a' ;
  //int b = 'z' ;
  //int c = 'A' ;
  //int d = 'Z' ;
  int e = 'j' ;
  //System.out.println(a);
  //System.out.println(b);
  //System.out.println(c);
  //System.out.println(d);
  if(e >= 95 && e <= 122)
  {
   System.out.println("it is lowercase");
  }
  if(e >= 65 && e <= 90)
  {
   System.out.println("it is uppercase");
  }

 }
}

