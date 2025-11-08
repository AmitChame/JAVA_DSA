import java.util.Arrays;
import java.util.Scanner;
public class input_Arr_2D {
    public static void main(String[] args){
        int[][] arr_2d=new int[3][4];
        Scanner scn=new Scanner(System.in);
        for(int row=0;row<3;row++){
            for(int col=0;col<4;col++){
                System.out.println("Enter element");
                arr_2d[row][col]=scn.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr_2d));
    }
}
