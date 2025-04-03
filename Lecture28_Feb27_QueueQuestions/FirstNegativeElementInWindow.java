package Lecture28_Feb27_QueueQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class FirstNegativeElementInWindow {

    static int[] firstNegative(int[] arr, int k) {

        int n = arr.length, idx = 0;
        int[] neg = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // no non-negative integer can be a valid answer
            if (arr[i] < 0)
                dq.add(i);

            // if the peekfirst is out of window, i.e, it does not belong to [i-k+1, i]
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1)
                dq.removeFirst();

            // as first window will be at i = k-1
            if (i >= k - 1) {
                if (dq.isEmpty())
                    neg[idx++] = 0;
                else
                    neg[idx++] = arr[dq.peekFirst()];
            }
        }
        return neg;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -1, 3, -3, 4, -6, 7, 8, 9 };

        int[] neg = firstNegative(arr, 3);

        for (int i : neg)
            System.out.print(i + " ");

    }
}
