import java.util.ArrayList;

public class StackAL {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.pop();
        stack.pop();
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println(stack.isEmpty());
        stack.push(25);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.push(18);
        stack.push(93);
        stack.push(46);
        System.out.println(stack.peek());
//


    }
}
