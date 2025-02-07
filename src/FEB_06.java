class MyArrayList {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public int size() {
        return size;
    }

    public void removeLast() {
        if (size > 0) {
            elements[--size] = null;
        } else {
            throw new IllegalStateException("List is empty. Cannot remove element.");
        }
    }
    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(10);
        list.add(25);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("Size: " + list.size());
        list.removeLast();
        System.out.println("Size after removal: " + list.size());
        System.out.println(list.get(0));
        list.removeLast();
        System.out.println("Size after second removal: " + list.size());
    }
}
