package Lecture27_Feb20_QueueUsingLinkedList_Qestion;

public class LinkedListQueue {

    class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            this.next = null;
        }
    }

    private int size;
    private Node front;
    private Node rear;

    LinkedListQueue() {
        size = 0;
        front = null;
        rear = null;
    }

    void enqueue(int item) {

        Node newNode = new Node(item);

        if (front == null)
            front = newNode;
        else
            rear.next = newNode;

        rear = newNode;
        size++;
    }

    int dequeue() {

        if (isEmpty())
            throw new IllegalStateException("Queue is empty, nothing to delete.");

        int first = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        size--;

        return first;
    }

    int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty, nothing to peek.");

        return front.data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("No elements in queue to display.");
            return;
        }

        Node head = front;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}
