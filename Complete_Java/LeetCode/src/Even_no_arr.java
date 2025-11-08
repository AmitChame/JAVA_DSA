//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class Even_no_arr {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("Output: " + findNumbers(nums));
    }
        static int findNumbers ( int[] nums){
            int count=0;
            for(int num:nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }

    static boolean even(int digi){
        int Noofdigit=digits(digi);
        if(Noofdigit%2==0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int digi=0;
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num>0){
            digi++;
            num=num/10;
        }
        return digi;
    }


}
