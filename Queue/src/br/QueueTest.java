package br;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.print();
       // queue.pop();
       // queue.print();
        System.out.println(queue.peek());
        System.out.println(queue.contains(25));

    }


}
