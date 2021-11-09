/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

public class studentAttendenceToSit
{
 public static void main(String[] args)
 {
  double totalClasses = 200.00 ;
  double attendedClassesOfA = 141.00 ;
  double perClassrs = ((attendedClassesOfA/totalClasses)*100.00);
  System.out.println(perClassrs);
  if(perClassrs >= 75.00)
  {
   System.out.println("A is allowed for sit in exam");
  }
  else
  {
  System.out.println("A is not allowed for sit in exam");
  }   
 }
}
  

