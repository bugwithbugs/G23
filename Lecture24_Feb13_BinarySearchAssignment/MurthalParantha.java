package Lecture24_Feb13_BinarySearchAssignment;

import java.util.Arrays;

public class MurthalParantha {
    static boolean isPossible (int[] arr, int P, int T) {

        int n = arr.length;
        int paranthas = 0;
        
        for(int i = 0; i < n; i++){
            int time = 0;
            int cnt = 1;

            while (time + cnt * arr[i] <= T) {
                time += cnt * arr[i];
                paranthas++;
                cnt++;
            }
        }

        return paranthas >= P;

    }
    
    static int binarySearch(int[] arr, int paranthas){

        int n = arr.length;
        Arrays.sort(arr);

        int low = 1;
        int high = paranthas * (paranthas + 1) * arr[n-1] / 2;
        int ans = 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if(isPossible(arr, paranthas, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr  = {1, 2, 3, 4};
        int paranthas = 5;
        System.out.println(binarySearch(arr, paranthas));
    }
}
