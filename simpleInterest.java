public class simpleInterest{
public static void main(String[] args){
    double amount;
    int interestRate = 12;
    int principal = 12000;
    int time = 2;
  amount = (1.0/100.0)*(interestRate * principal * time);
    System.out.println(amount);
    System.out.println(amount + principal);
}
}