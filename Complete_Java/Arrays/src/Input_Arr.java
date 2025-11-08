import java.util.Arrays;
import java.util.Scanner;

public class Input_Arr {
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter element");
            arr[i]=scn.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}