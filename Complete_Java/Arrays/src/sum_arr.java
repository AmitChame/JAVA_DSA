import java.util.Scanner;

public class sum_arr {
        public static void main(String args[]){
            int[] arr={1,2,3,4,5};
//            Scanner scn=new Scanner(System.in);
//            System.out.println("Enter element to add in array");
//            for(int j=0;j<5;j++){
//
//            }

            int s=0;
            for(int i=0;i<5;i++){
                s=s+arr[i];
            }
            System.out.println(s);


        }
    }

