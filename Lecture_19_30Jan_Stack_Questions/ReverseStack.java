package Lecture_19_30Jan_Stack_Questions;

import java.util.Stack;

public class ReverseStack {

    static void reverse (Stack<Integer> st) {

        if(st.isEmpty())
        return;

        int top = st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }

    static void insertAtBottom (Stack<Integer> st, int item){

        if(st.isEmpty()){
            st.push(item);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, item);
        st.push(top);
    }
    
    public static void main(String[] args) {
        
        ReverseStack obj = new ReverseStack();
        Stack<Integer> st = new Stack<>();

        int n = 5;

        for(int i = 1; i <= n; i++){
            st.push(10 * i);
        }

        System.out.println(st);

        obj.reverse(st);

        System.out.println(st);
        
    }
}
