import java.util.*;
public class varargs {

    public static void main(String[] args){

        arg(1,2,3,4,5,6,7,8,9);
    }

    public static void arg(int ...v){
        System.out.println("v");
    }
}
