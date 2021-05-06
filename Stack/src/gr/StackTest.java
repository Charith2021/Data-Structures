package gr;

public class StackTest {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.print();
        stack.pop();
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.contains(25));


    }

}
