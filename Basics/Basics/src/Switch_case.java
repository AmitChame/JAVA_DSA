import java.util.Scanner;

public class Switch_case {
    public static void main (String args[]) {
        System.out.println("Enter your percentage");
        Scanner scn=new Scanner(System.in);
        int Per=scn.nextInt();
        switch(Per){
            case 1:

                break;

            case 2:
                if(Per>80){
                    System.out.println("B grade");
                }
                break;
            case 3:
                if(Per<80){
                    System.out.println("C grade");
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
