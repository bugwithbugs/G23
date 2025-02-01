package Lecture18_Jan29_Stack;

public class MyStackClient_3 {
    public static void main(String[] args) {
        try {
            MyStack_2 ms = new MyStack_2();

            //MyStack_2 ms1 = new MyStack_2(120); // Explore by yourself

            //System.out.println(ms.peek()); // Uncommment this to throw exception that is handled in catch block.
            ms.push(10);
            ms.push(20);
            ms.push(30);
            ms.push(40);

            ms.display();

            System.out.println("Current Top element of the stack: " + ms.peek());

            System.out.println("Deleting the top element: " + ms.pop());

            ms.pop();
            ms.pop();

            System.out.println("Is stack empty? " + ms.isEmpty());

            ms.pop();

            System.out.println("Is stack empty? " + ms.isEmpty());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    
    }
}
