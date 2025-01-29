package Lecture_18_29Jan_Stack;

public class MyStack_2 {
    private int[] arr;
    private int index = -1;

    MyStack_2 () {
        arr = new int[20];
    }

    MyStack_2(int size) {
        arr = new int[size];
    }

    public void push (int item) {
        if(isFull()){ // Stack overflow
            throw new IllegalStateException("Stack is already full.");
        }
        index ++;
        arr[index] = item;
    } 

    public int peek () {
        if(isEmpty()){ // Stack underflow
            throw new IllegalStateException("Stack is already empty.");
        }

        return arr[index];
    }

    public int pop () {
        if(isEmpty()){ // Stack underflow
            throw new IllegalStateException("Stack is already empty.");
        }
        int top = peek();
        index --;
        return top;
    }

    public int size () {
        return index + 1;
    }

    public boolean isEmpty () {
        return size() == 0;
    }

    public boolean isFull () {
        return size() == arr.length;
    }

    public void display () {
        for(int i = index; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
