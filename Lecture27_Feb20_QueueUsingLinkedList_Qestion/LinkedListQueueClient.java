package Lecture27_Feb20_QueueUsingLinkedList_Qestion;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Size of queue: " + q.size());
        System.out.println("Deleting front of the queue: " + q.dequeue());
        System.out.println("New front of the queue: " + q.peek());

        q.dequeue();
        q.dequeue();

        System.out.println("Deleted 2 elements.");

        q.display();

    }
}
