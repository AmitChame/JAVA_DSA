import java.util.*;

public class Avg_Ele {
    public static void main(String args[]){
        int[] arr=new int[5];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter element");
            arr[i]=scn.nextInt();
        }
        int L=arr.length;
        int sum=0;
        for(int j=0;j<5;j++){
            sum=sum+arr[j];
        }
        int avg=sum/L;
        System.out.println(avg);
    }
}
