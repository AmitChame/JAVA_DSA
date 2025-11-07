public class min_element {
    public static void main(String[]args){
        int[] arr={123,345,567,789,876,654,432,321};
//        int ans=0;
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
//            System.out.println(ans);
        }
//        System.out.println("Not found");
        return ans;
    }
}
