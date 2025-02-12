package Lecture23_Feb12_StackUsingLinkedList;

public class MyStackClient {
    public static void main(String[] args) {
        try {
            StackUsingLinkedList st = new StackUsingLinkedList();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        

        st.display();

        System.out.println("Size of stack: " + st.size());
        System.out.println("Top of stack: " + st.peek());
        System.out.println("Deleting top of stack: " + st.pop());
        System.err.println("Is stack empty? " + st.isEmpty());

        System.out.println("Deleting 3 more items.");

        st.pop();
        st.pop();
        st.pop();
        st.pop();

        System.err.println("Is stack empty? " + st.isEmpty());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
