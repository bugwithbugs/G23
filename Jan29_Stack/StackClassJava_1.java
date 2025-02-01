package Jan29_Stack;

import java.util.Stack;

public class StackClassJava_1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);

        System.out.println("Current Top element of the stack: " + st.peek());

        System.out.println("Deleting the top element: " + st.pop());

        st.pop();
        st.pop();

        System.out.println("Is stack empty? " + st.isEmpty());

        st.pop();

        System.out.println("Is stack empty? " + st.empty());
    }
}
