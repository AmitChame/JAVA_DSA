public class Lin_Search {
    public static void main(String[] args){
        int[] nums={11,23,43,543,1234};
        int target=43;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);

    }
    static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<=arr.length;i++){
           // arr[i]=target;
            int element=arr[i];
            if(element==target){
                return i;
            }


        }
        return -1;

    }
}
