import java.util.*;

public class Collectionsques {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //add elements
        list.add(11);
        list.add(1);
        System.out.println(list);

        // get elements
        int element =list.getFirst();
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


        ArrayList<String> list1= new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");
        System.out.println(list1);
        list1.set(1,"Yellow");
        System.out.println(list1);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list2.get(1));


        HashSet<Integer> set= new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);

        HashSet<String> set5= new HashSet<>();
        set5.add("Dog");
        set5.add("Cat");
        set5.add("Apple");
        set5.add("Banana");
        System.out.println("contains Cat ? "+set5.contains("Cat"));
        System.out.println(set5);

        LinkedHashSet<String> set1= new LinkedHashSet<>();
        set1.add("Alice");
        set1.add("Bob");
        set1.add("Charles");
        set1.add("Alice");
        System.out.println(set1);
        System.out.println("contains Bob ? "+set1.contains("Bob"));
        List<String> list5 = new ArrayList<>(set1);
        System.out.println(list5.get(1));
    Collections.sort(list5,Collections.reverseOrder());
        System.out.println(list5);

        Scanner in= new Scanner(System.in);
        String str=in.nextLine();
        String[] words = str.split(" ");
        LinkedHashSet<String> set2= new LinkedHashSet<>();
        for(String s: words){
            set2.add(s);

        }
        System.out.println(String.join(" ",set2));



        List<Integer> list8 = Arrays.asList(1, 7, 3, 2, 5);
        List<Integer> list9 = Arrays.asList(5, 3, 6,4, 7);

        LinkedHashSet<Integer> set6 = new LinkedHashSet<>(list8);
        LinkedHashSet<Integer> set7 = new LinkedHashSet<>(list9);
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        for (Integer num : set6) {
            if (set7.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("intersection "+ intersection);


        //
        List<String> list3 = Arrays.asList("Akshi","Swati","Swati","Harshit","Isha","Akshi","Harshit");
        LinkedHashSet<String> set3 = new LinkedHashSet<>(list3);
        System.out.println(set3);


        //treeset
        TreeSet<Integer> t1=new TreeSet<>();
        t1.add(50);
        t1.add(20);
        t1.add(40);
        System.out.println(t1);

        //
        TreeSet<String> t2=new TreeSet<>();
        t2.add("Zebra");
        t2.add("Apple");
        t2.add("Mango");
        System.out.println(t2.first());
        System.out.println(t2.last());


        TreeSet<Integer> t3=new TreeSet<>();
        t3.add(5);
        t3.add(10);
        t3.add(15);
        t3.removeFirst();
        System.out.println(t3);


        //
        LinkedHashMap<String,String> lh=new LinkedHashMap<>();
        lh.put("Sakshi","Sak123");
        lh.put("Akanksha","Akshi20");
        lh.put("Samar","Sam456");
        System.out.println(lh);
        if (lh.containsKey("Akanksha")) {
            lh.put("Akanksha", "Akshi20_1");
            System.out.println("Password updated successfully.");
        }
        System.out.println(lh);

        //
        TreeMap<String, Integer> wordsMap = new TreeMap<>();
        wordsMap.put("apple", "apple".length());
        wordsMap.put("banana", "banana".length());
        wordsMap.put("cherry", "cherry".length());
        wordsMap.put("date", "date".length());
        wordsMap.put("elderberry", "elderberry".length());
        System.out.println("words and their lengths: " + wordsMap);



        //
        TreeMap<Integer, String> empMap = new TreeMap<>();
        empMap.put(101, "Alice");
        empMap.put(102, "Bob");
        empMap.put(103, "Charlie");
        empMap.put(104, "David");

        Integer firstKey = empMap.firstKey();
        Integer lastKey = empMap.lastKey();

        System.out.println("First Employee ID: " + firstKey);
        System.out.println("Last Employee ID: " + lastKey);

        //
}
}

class Parent1{
    void show(){
        System.out.println("Parents's Method ");
    }
}
class Child1 extends Parent1{
    @Override
    void show(){
        System.out.println("Child's Class ");
    }
}

class OldClass {
    @Deprecated
    void oldMethod(){
        System.out.println("This method is deprecated.Use new method");
    }
    void newMethod(){
        System.out.println("This is the new method");
    }
}
 class DeprecatedExample{
    public static void main(String[] args){
        OldClass obj=new OldClass();
        obj.oldMethod();
        obj.newMethod();
    }
}
