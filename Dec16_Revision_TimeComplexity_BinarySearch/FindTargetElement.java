package Dec16_Revision_TimeComplexity_BinarySearch;

import java.util.Scanner;

public class FindTargetElement {

    //time complexity: O(logn)
    public static int binarySearch(int[] arr, int target) {
        
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) 
                return mid;  
            else if (arr[mid] < target) 
                left = mid + 1;
            else 
                right = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        // input sorted array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element " + target + " not found.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }

        scanner.close();
    }
}
