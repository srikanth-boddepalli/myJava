/*if a number is divide by 4 then print "good morning"
  number is divide by 3 then print "good afternoon"
  number is divide by both 3 & 4 then print "good evening"
  number is didnot divide by 3 & 4 then print "good night".*/

public class printingGmGaGaGnByDiv
{
 public static void main(String[] args)
 {
  int number = 12 ;
  if((number%4 == 0) && (number%3 != 0))
  {
   System.out.println("good morning");
  }
  else if((number%3 == 0) && (number%4 != 0))
  {
   System.out.println("good afternoon");   
  }
  else if((number%3 == 0) && (number%4 == 0))
  {
   System.out.println("good afternoon");   
  }
  else
  {
   System.out.println("good night");  
  }
 }
} 
  
   
