public class Sea_inString {
    public static void main(String[] args){
        String str= "Amit";
        char target='i';
        System.out.println(Search(str,target));

    }
    static Boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
//        for(char ch: str.toCharArray()){
//            if(ch==target){
//                return true;
//            }
//        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
