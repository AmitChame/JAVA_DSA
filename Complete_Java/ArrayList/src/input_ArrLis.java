import java.util.ArrayList;
import java.util.Scanner;

public class input_ArrLis {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        int ele=1;
        while(ele>0){
            if(ele==0){
                break;
            }else {
            System.out.println("enter element enter 0 to exit");
            ele=scn.nextInt();
            list.add(ele);}
        }
        System.out.println(list);
    }
}
