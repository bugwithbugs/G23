package Lecture_17_27Jan_LinkedList_Questions;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedListClassWithTail list = new LinkedListClassWithTail();

        list.insertTail(10);
        list.insertTail(20);

        list.display();

        list.deleteTail();

        list.display();
    }
}
