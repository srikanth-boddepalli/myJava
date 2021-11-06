public class leapYear{
public static void main(String[] args){
    int a = 2003;
    String leap_year = (a%400==0)?((a%4==0)?"it is leap year":"it is not leap year"):"it is not leap year";
    System.out.println(leap_year);
}
}