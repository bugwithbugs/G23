package Lecture26_Feb19_QueueUsingArray;

public class ArrayQueue {

    private int front;
    private int rear;
    private int size;
    private int capacity;
    private int[] arr;

    ArrayQueue() {
        capacity = 20;
        front = 0;
        rear = 0;
        size = 0;
        arr = new int[capacity];
    }

    ArrayQueue(int length) {
        capacity = length;
        front = 0;
        rear = 0;
        size = 0;
        arr = new int[capacity];
    }

    void enqueue(int item) {

        if (isFull())
            throw new IllegalStateException("Queue is full");

        arr[rear % capacity] = item;
        rear++;
        size++;
    }

    int dequeue() {

        if (isEmpty())
            throw new IllegalStateException("Queue is Empty.");

        int frontElement = arr[front % capacity];

        front++;
        size--;

        return frontElement;

    }

    int peek() {

        if (isEmpty())
            throw new IllegalStateException("Queue is Empty.");

        return arr[front % capacity];
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void display() {
        // if rear <= front
        // print from front to end of array
        // print from 0 to rear;
        if (isEmpty()) {
            System.out.println("Queue has no elements.");
            return;
        }

        if (rear <= front) {
            for (int i = front; i < capacity; i++)
                System.out.print(arr[i] + " ");
            for (int i = 0; i < rear; i++)
                System.out.print(arr[i] + " ");
        } else {
            for (int i = front; i < rear; i++)
                System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
