public class HashExample {
    public static void main(String[] args) {
        String key="apple";
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) %10;
        System.out.println("Hash Code : "+hashCode);
        System.out.println("Index in Table : "+index);
    }
}
