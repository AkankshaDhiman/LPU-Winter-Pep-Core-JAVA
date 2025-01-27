import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //add elements
        list.add(11);
        list.add(1);
        System.out.println(list);

        // get elements
        int element =list.get(0);
        System.out.println(element);
        //add el in btw
        list.add(1,3);
        System.out.println(list);
        //set el
        list.set(2,8);
        System.out.println(list);
        //remove el
        list.remove(1);
        System.out.println(list);
        //size
        System.out.println(list.size());
        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
