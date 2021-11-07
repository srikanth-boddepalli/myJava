public class stringAndStringBufferInEquals{
public static void main(String[] args){
    String name = new String("srikanth");
    String myName = new String("srikanth");

    System.out.println(name == myName);
    System.out.println(name.equals(myName));
    
    StringBuffer me = new StringBuffer("srikanth");
    StringBuffer he = new StringBuffer("srikanth");

    System.out.println(me == he );
    System.out.println(me.equals(he));
   }
 }