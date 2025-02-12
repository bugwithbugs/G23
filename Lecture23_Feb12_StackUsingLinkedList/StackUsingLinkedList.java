package Lecture23_Feb12_StackUsingLinkedList;



public class StackUsingLinkedList {
    private Node head;
    private int size;


    private class Node {
        int data;
        Node next;
    
        Node(int item){
            this.data = item;
            this.next = null;
        }
    }

    StackUsingLinkedList () {
        head = null;
        size = 0;
    }

    void push(int item){
        Node newNode = new Node(item);

        newNode.next = head;
        head = newNode;

        size ++;
    }

    int pop () {

        if(isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }

        int top = head.data;
        head = head.next;
        size --;

        return top;
    }

    int peek () {
       
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }
        return head.data;
    }
    
    int size () {
        return size;
    }

    boolean isEmpty () {
        return size == 0;
    }

    void display () {
        Node curr = head;

        while (curr!=null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

}
