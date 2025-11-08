import java.util.Arrays;

public class Search_in2D {
    public static void main(String[]args){
        int[][] arr_2D={
                {12,23,4,5},
                {34,45,12,4},
                {45,4,2,21},
                {1,23,3,4,5}
        };
        int target=34;
//        System.out.println(Search_2D(arr_2D,target));
        int[] ans=Search_2D(arr_2D,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search_2D(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
//                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
