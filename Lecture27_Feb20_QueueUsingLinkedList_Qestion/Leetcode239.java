package Lecture27_Feb20_QueueUsingLinkedList_Qestion;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] maxArr = new int[n - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // ensuring the window is always of k size
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // deleting elements that cannot be a candidate for maxm
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i + 1 >= k)
                maxArr[i - k + 1] = nums[dq.peekFirst()];

        }

        return maxArr;
    }
}
