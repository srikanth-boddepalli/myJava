/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/

public class gradingSystemInSchool
{
 public static void main(String[] arg)
 {
  int a = 50;
  if(a <= 25)
  {
   System.out.println("you got 'F' grad");
  }
  if(a >25 && a <=45)
  {
   System.out.println("you got 'E' grad");
  }
  if(a > 45 && a <=50)
  {
   System.out.println("you got 'D' grad");
  }
  if(a > 50 && a <=60)
  {
   System.out.println("you got 'C' grad");
  } 
  if(a > 60 && a <=80)
  {
   System.out.println("you got 'B' grad");
  }
  if(a > 80 && a <=100)
  {
   System.out.println("you got 'D' grad");
  }
 }
} 