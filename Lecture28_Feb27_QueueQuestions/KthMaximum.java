package Lecture28_Feb27_QueueQuestions;

import java.util.PriorityQueue;

public class KthMaximum {

    static int findKthMaximum(int[] arr, int k) {
        int n = arr.length, ans;

        // By default minHeap is created
        // LEARN how to create a maxHeap - IMP
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);

            if (pq.size() > k)
                pq.remove();
        }

        ans = pq.peek();

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;

        System.out.println(findKthMaximum(arr, k));
    }
}
