public class Search_inRange {
    public static void main(String[]args){
        int[] arr={13,42,25,64,53,47,86,643};
        int target=47;
        System.out.println(Search(arr,target,1,6));
    }

    static int Search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target) {
                //arr[i]=target;
                return i;
            }
        }
        return -1;
    }
}
