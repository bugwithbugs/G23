package Lecture26_Feb19_QueueUsingArray;

public class ArrayQueueClient {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Size of queue: " + q.size());
        System.out.println("Deleting front: " + q.dequeue());
        System.out.println("New front: " + q.peek());
        System.out.println("New size of queue: " + q.size());

        q.dequeue();
        q.dequeue();

        System.out.println("Deleted 2 elements.");

        q.display();
    }
}
