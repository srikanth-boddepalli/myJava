public class ascOrder{
public static void main(String[] args){
    int [] numbers= {8,2,9,1,0,3};
    for(int i = 1; i<6; i++){
       for(int j = 1; j<i;j++){
          if (numbers[j] > numbers[j+1]){ 
             int temp ;
             temp = numbers[j] ;
             numbers[j] = numbers[j+1];
             numbers[j+1] = temp;

         System.out.println(numbers);
          }

         System.out.println(numbers);
        }
      }
    }
  }