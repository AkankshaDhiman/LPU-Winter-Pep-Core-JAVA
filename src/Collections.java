import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<Integer>();
//        //add elements
//        list.add(11);
//        list.add(1);
//        System.out.println(list);
//
//        // get elements
//        int element =list.get(0);
//        System.out.println(element);
//        //add el in btw
//        list.add(1,3);
//        System.out.println(list);
//        //set el
//        list.set(2,8);
//        System.out.println(list);
//        //remove el
//        list.remove(1);
//        System.out.println(list);
//        //size
//        System.out.println(list.size());
//        // sorting
//        Collections.sort(list);
//        System.out.println(list);

        //
//        ArrayList<String> list1= new ArrayList<String>();
//        list1.add("Red");
//        list1.add("Blue");
//        list1.add("Green");
//        System.out.println(list1);
//        list1.set(1,"Yellow");
//        System.out.println(list1);
//
//        ArrayList<Integer> list2= new ArrayList<Integer>();
//        list2.add(10);
//        list2.add(20);
//        list2.add(30);
//        System.out.println(list2.get(1));


//        HashSet<Integer> set= new HashSet<>();
//        set.add(2);
//        set.add(1);
//        set.add(3);
//        System.out.println(set);

        HashSet<String> set= new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Apple");
        set.add("Banana");
        System.out.println("comntains Cat ? "+set.contains("Cat"));
        System.out.println(set);

    }
}
