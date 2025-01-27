import java.util.*;

public class Collectionsques {
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

//        HashSet<String> set= new HashSet<>();
//        set.add("Dog");
//        set.add("Cat");
//        set.add("Apple");
//        set.add("Banana");
//        System.out.println("contains Cat ? "+set.contains("Cat"));
//        System.out.println(set);

//        LinkedHashSet<String> set1= new LinkedHashSet<>();
//        set1.add("Alice");
//        set1.add("Bob");
//        set1.add("Charles");
//        set1.add("Alice");
//        System.out.println(set1);
//        System.out.println("contains Bob ? "+set1.contains("Bob"));
//        List<String> list1 = new ArrayList<>(set1);
//        System.out.println(list1.get(1));
//    Collections.sort(list1,Collections.reverseOrder());
//        System.out.println(list1);
//
//        Scanner in= new Scanner(System.in);
//        String str=in.nextLine();
//        String[] words = str.split(" ");
//        LinkedHashSet<String> set2= new LinkedHashSet<>();
//        for(String s: words){
//            set2.add(s);
//
//        }
//        System.out.println(String.join(" ",set2));


        //
        List<Integer> list1 = Arrays.asList(1, 7, 3, 2, 5);
        List<Integer> list2 = Arrays.asList(5, 3, 6,4, 7);

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(list1);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list2);
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("intersection "+ intersection);


        //
        List<String> list3 = Arrays.asList("Akshi","Swati","Swati","Harshit","Isha","Akshi","Harshit");
        LinkedHashSet<String> set3 = new LinkedHashSet<>(list3);
        System.out.println(set3);

    }
}
