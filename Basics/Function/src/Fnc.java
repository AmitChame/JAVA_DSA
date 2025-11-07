import java.lang.foreign.AddressLayout;
import java.util.*;

public class Fnc {
    public static void main (String args[]){
        sum();
        }
         public static void sum(){
            Scanner scn=new Scanner(System.in);
            System.out.println("Enter first number");
            int A =scn.nextInt();
            System.out.println("Enter second number");
            int B =scn.nextInt();
            int Addition=0;

            Addition = A + B;
            System.out.println("Sum="+Addition);
        }




}
