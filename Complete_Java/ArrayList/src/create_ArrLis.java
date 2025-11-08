import java.util.*;

public class create_ArrLis {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(123);
        list.add(345);
        list.add(856);
        list.add(1009);

        //to edit the value you have to pass index and new value in function set()
        list.set(2,100);

        //to delete the element just pass the element index to function remove()
        list.remove(4);

        //to get the perticular element at perticular location pass the index value to function get()
        list.get(2);
        System.out.println(list);
    }
}
