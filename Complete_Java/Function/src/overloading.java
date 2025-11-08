public class overloading {
    public static void main(String[] args){
        Over(1,"Abc");
        Over(1,2);

    }
    static void Over(int A, String B){
        System.out.println(A);
    }

    static void Over(int A, int B){
        System.out.println("Sum="+(A+B));
    }
}
