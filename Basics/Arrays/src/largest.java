import java.util.Scanner;

public class largest {
    public static void main(String args[]){
        int[] arr=new int[5];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter element");
            arr[i]=scn.nextInt();
        }
        int large=0;
        for(int j=0;j<5;j++){
            if(arr[j]>large){
                large=arr[j];
            }

        }
        System.out.println(large);
    }
}
