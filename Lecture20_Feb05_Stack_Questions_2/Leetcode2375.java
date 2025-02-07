package Lecture20_Feb05_Stack_Questions_2;

import java.util.Stack;

public class Leetcode2375 {

    public static String smallestNumber (String pattern){
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        int n = pattern.length();

        for(int i = 0; i <= n; i++){

            st.push(i + 1);

            if(i == n || pattern.charAt(i) == 'I'){
                while (!st.isEmpty()) {
                    ans.append(st.pop());
                }
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();

    }

    public static void main(String[] args) {
        String s = new String("IIDDIDDD");

        String ans = smallestNumber(s);
        System.out.println(ans);
    }
}
