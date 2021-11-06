public class factorsOfNumber{

public static void main(String[] args){
int a = 16;
int temp = 0;
for (int i=1;i<a;i++){
    if(a%i == 0){
    temp = i; 
System.out.println(temp);
}
}
}
}