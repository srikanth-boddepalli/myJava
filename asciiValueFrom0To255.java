//Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.
public class asciiValueFrom0To255
{
 public static void main(String[] args)
 {
  char ch = 0 ;
  int num = 0 ;
  while(ch <= 255)
  { 
   System.out.println(ch+"   "+num);
   ch++;
   num++;
  }
 }
}